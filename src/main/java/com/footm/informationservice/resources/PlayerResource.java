package com.footm.informationservice.resources;

import com.footm.informationservice.api.Player;
import com.footm.informationservice.api.PlayerFullSpecification;
import com.footm.informationservice.api.PlayerPositions;
import com.footm.informationservice.api.PlayerSkills;
import com.footm.informationservice.db.PlayerDao;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * The class PlayerResource is associated with /players URl. It uses JAX-RS(JERSEY) annotations to define the request and
 * the response.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
@Path("players")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource {
    private PlayerDao playerDao;

    public PlayerResource(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @GET
    @Path("/{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@NotNull @PathParam("playerId") int id) {
        Player player = playerDao.getPlayer(id);

        if (player != null) {
            return player;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/{playerId}/skills")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerSkills getPlayerSkills(@NotNull @PathParam("playerId") int id) {
        PlayerSkills playerSkills = playerDao.getPlayerSkills(id);

        if (playerSkills != null) {
            return playerSkills;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/{playerId}/positions")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerPositions getPlayerPositions(@NotNull @PathParam("playerId") int id) {
        PlayerPositions playerPositions = playerDao.getPlayerPositions(id);

        if (playerPositions != null) {
            return playerPositions;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/club/{clubId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInClub(@NotNull @PathParam("clubId") String clubId) {
        List<Player> listPlayersInClub = playerDao.getPlayersInClub(clubId);

        if (listPlayersInClub != null && !listPlayersInClub.isEmpty()) {
            return listPlayersInClub;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/nationality/{nationalityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInNationality(@NotNull @PathParam("nationalityId") String nationalityId) {
        List<Player> listPlayersInNationality = playerDao.getPlayersInNationality(nationalityId);

        if (listPlayersInNationality != null && !listPlayersInNationality.isEmpty()) {
            return listPlayersInNationality;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/search/{playerNamePattern}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getListPlayersWithMatchingNamePatterns(@PathParam("playerNamePattern") String playerNamePattern) {
        return playerDao.getListPlayersWithMatchingNamePatterns("%" + playerNamePattern + "%");
    }

    @GET
    @Path("/{playerId}/full")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerFullSpecification getPlayerWithFullSpecification(@NotNull @PathParam("playerId") int id) {
        PlayerFullSpecification playerFullSpecification = playerDao.getPlayerWithFullSpecification(id);

        if (playerFullSpecification != null) {
            return playerFullSpecification;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getListPlayersMatchingTheQuery(@NotNull @QueryParam("sort") String sort,
                                                       @QueryParam("nationality") String nationality,
                                                       @QueryParam("position") List<String> playerPositions,
                                                       @NotNull @QueryParam("ovrGte") Integer ovrGte,
                                                       @NotNull @QueryParam("ovrLte") Integer ovrLte) {

        if (nationality != null && !playerPositions.isEmpty()) {
            return playerDao.filterPlayersWithSortNationalityPlayerPositionOvrGteOvrLte(sort, nationality, playerPositions, ovrGte, ovrLte);
        } else if (nationality != null) {
            return playerDao.filterPlayersWithSortOverGteOvrLtNationality(sort, ovrGte, ovrLte, nationality);
        } else if (!playerPositions.isEmpty()) {
            return playerDao.filterPlayersWithSortOverGteOvrLtPosition(sort, ovrGte, ovrLte, playerPositions);
        } else {
            return playerDao.filterPlayersWithSortOverGteOvrLte(sort, ovrGte, ovrLte);
        }
    }

}
