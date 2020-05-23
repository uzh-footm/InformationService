package com.footm.informationservice.resources;


import com.footm.informationservice.api.League;
import com.footm.informationservice.db.LeagueDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("leagues")
@Produces(MediaType.APPLICATION_JSON)
public class LeagueResource {

    private LeagueDao leagueDao;

    public LeagueResource(LeagueDao leagueDao) {
        this.leagueDao = leagueDao;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<League> getListLeagues() {
        return leagueDao.getListLeagues();
    }

}
