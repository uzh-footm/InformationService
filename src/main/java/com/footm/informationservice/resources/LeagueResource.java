package com.footm.informationservice.resources;


import com.footm.informationservice.api.League;
import com.footm.informationservice.db.LeagueDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * The class LeagueResource is associated with /leagues URl. It uses JAX-RS(JERSEY) annotations to define the request and
 * the response.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
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
