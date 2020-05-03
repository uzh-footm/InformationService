package com.footm.informationservice.resources;

import com.footm.informationservice.api.Player;
import com.footm.informationservice.api.PlayerFullSpecification;
import com.footm.informationservice.api.PlayerPositions;
import com.footm.informationservice.api.PlayerSkills;
import com.footm.informationservice.db.PlayerDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource {
    private PlayerDao playerDao;

    public PlayerResource(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    @GET
    @Path("/{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@PathParam("playerId") int id) {
        return playerDao.getPlayer(id);
    }

    @GET
    @Path("/{playerId}/skills")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerSkills getPlayerSkills(@PathParam("playerId") int id) {
        return playerDao.getPlayerSkills(id);
    }

    @GET
    @Path("/{playerId}/positions")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerPositions getPlayerPositions(@PathParam("playerId") int id) {
        return playerDao.getPlayerPositions(id);
    }

    @GET
    @Path("/club/{clubId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInClub(@PathParam("clubId") String clubId) {
        return playerDao.getPlayersInClub(clubId);
    }

    @GET
    @Path("/nationality/{nationalityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInNationality(@PathParam("nationalityId") String nationalityId) {
        return playerDao.getPlayersInNationality(nationalityId);
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
    public PlayerFullSpecification getPlayerWithFullSpecification(@PathParam("playerId") int id) {
        return playerDao.getPlayerWithFullSpecification(id);
    }

}
