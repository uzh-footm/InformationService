package com.footm.informationservice.resources;

import com.footm.informationservice.api.Club;
import com.footm.informationservice.db.ClubDao;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    @Path("{clubId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Club getClubWithId(@PathParam("clubId") String clubId) {
        Club club = clubDao.getClubWithId(clubId);
        if (club != null) {
            return club;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("league/{leagueId}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubsInLeague(@PathParam("leagueId") String leagueId) {
        List<Club> listClubsInLeague = clubDao.getListClubsInLeague(leagueId);

        if (listClubsInLeague != null && !listClubsInLeague.isEmpty()) {
            return listClubsInLeague;
        }
        throw new WebApplicationException(Response.Status.NOT_FOUND);
    }

    @GET
    @Path("/search/{clubNamePattern}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubsWithMatchingNamePatterns(@PathParam("clubNamePattern") String clubNamePattern) {
        return clubDao.getListClubsWithMatchingNamePatterns("%" + clubNamePattern + "%");
    }
}
