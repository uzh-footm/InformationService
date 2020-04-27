package com.footm.informationservice.resources;

import com.footm.informationservice.api.Club;
import com.footm.informationservice.api.Player;
import com.footm.informationservice.db.ClubDao;
import com.footm.informationservice.db.PlayerDao;
import org.jdbi.v3.core.Jdbi;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("clubs")
@Produces(MediaType.APPLICATION_JSON)
public class ClubResource {

    private Jdbi jdbdi;

    public ClubResource(Jdbi jdbdi){
        this.jdbdi=jdbdi;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Club> getListClubs(){
        return jdbdi.withExtension(ClubDao.class, dao -> dao.getListClubs());
    }

}
