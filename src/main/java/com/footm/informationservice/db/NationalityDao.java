package com.footm.informationservice.db;


import com.footm.informationservice.api.Nationality;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface NationalityDao {

    @SqlQuery("Select nationality AS id, Logo from nationalities")
    @RegisterBeanMapper(Nationality.class)
    List<Nationality> getListNationalities();
}
