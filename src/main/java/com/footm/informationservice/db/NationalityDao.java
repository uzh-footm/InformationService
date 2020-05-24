package com.footm.informationservice.db;


import com.footm.informationservice.api.Nationality;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

/**
 * The interface NationalityDao uses the JDBI SQL Object API to communicate with DB, it takes advantage of mapping between
 * relations and object.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
public interface NationalityDao {

    @SqlQuery("Select nationality AS id, Logo from nationalities ORDER BY nationality ASC")
    @RegisterBeanMapper(Nationality.class)
    List<Nationality> getListNationalities();
}
