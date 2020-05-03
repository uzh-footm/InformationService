package com.footm.informationservice.resources;

import com.footm.informationservice.api.Nationality;
import com.footm.informationservice.db.NationalityDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("nationalities")
@Produces(MediaType.APPLICATION_JSON)
public class NationalityResource {

    private NationalityDao nationalityDao;

    public NationalityResource(NationalityDao nationalityDao) {
        this.nationalityDao = nationalityDao;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Nationality> getListNationalities() {
        return nationalityDao.getListNationalities();
    }
}
