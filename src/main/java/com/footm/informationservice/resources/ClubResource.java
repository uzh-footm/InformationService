package com.footm.informationservice.resources;

import com.footm.informationservice.api.Club;
import com.footm.informationservice.db.ClubDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("clubs")
@Produces(MediaType.APPLICATION_JSON)
public class ClubResource {

    private ClubDao clubDao;

    public ClubResource(ClubDao clubDao) {
        this.clubDao = clubDao;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubs() {
        return clubDao.getListClubs();
    }

    @GET
    @Path("league/{leagueId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubsInLeague(@PathParam("leagueId") String leagueId) {
        return clubDao.getListClubsInLeague(leagueId);
    }

    @GET
    @Path("/search/{clubNamePattern}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubsWithMatchingNamePatterns(@PathParam("clubNamePattern") String clubNamePattern) {
        return clubDao.getListClubsWithMatchingNamePatterns("%" + clubNamePattern + "%");
    }
}
