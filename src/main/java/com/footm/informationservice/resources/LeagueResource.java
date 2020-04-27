package com.footm.informationservice.resources;


import com.footm.informationservice.api.League;
import com.footm.informationservice.db.LeagueDao;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("leagues")
@Produces(MediaType.APPLICATION_JSON)
public class LeagueResource {

    private Jdbi jdbdi;

    public LeagueResource(Jdbi jdbdi) {
        this.jdbdi = jdbdi;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<League> getListLeagues() {
        return jdbdi.withExtension(LeagueDao.class, dao -> dao.getListLeagues());
    }

}
