package com.footm.informationservice.resources;

import com.footm.informationservice.api.Player;
import com.footm.informationservice.api.PlayerFullSpecification;
import com.footm.informationservice.api.PlayerPositions;
import com.footm.informationservice.api.PlayerSkills;
import com.footm.informationservice.db.PlayerDao;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("player")
@Produces(MediaType.APPLICATION_JSON)
public class PlayerResource {
    private Jdbi jdbdi;

    public PlayerResource(Jdbi jdbi) {this. jdbdi = jdbi;}

    @GET
    @Path("/{playerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Player getPlayer(@PathParam("playerId") int id){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayer(id));
    }

    @GET
    @Path("/{playerId}/skills")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerSkills getPlayerSkills(@PathParam("playerId") int id){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayerSkills(id));
    }

    @GET
    @Path("/{playerId}/positions")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerPositions getPlayerPositions(@PathParam("playerId") int id){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayerPositions(id));
    }

    @GET
    @Path("/club/{clubId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInClub(@PathParam("clubId") String clubId){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayersInClub(clubId));
    }

    @GET
    @Path("/nationality/{nationalityId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getPlayersInNationality(@PathParam("nationalityId") String nationalityId){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayersInNationality(nationalityId));
    }

    @GET
    @Path("/search/{playerNamePattern}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Player> getListPlayersWithMatchingNamePatterns(@PathParam("playerNamePattern") String playerNamePattern){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getListPlayersWithMatchingNamePatterns("%"+playerNamePattern+"%"));
    }

    @GET
    @Path("/{playerId}/full")
    @Produces(MediaType.APPLICATION_JSON)
    public PlayerFullSpecification getPlayerWithFullSpecification(@PathParam("playerId") int id){
        return jdbdi.withExtension(PlayerDao.class, dao -> dao.getPlayerWithFullSpecification(id));
    }

}
