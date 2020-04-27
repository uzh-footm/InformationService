package com.footm.informationservice.db;

import com.footm.informationservice.api.Club;
import com.footm.informationservice.api.League;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface LeagueDao {

    @SqlQuery("Select league AS id from leagues")
    @RegisterBeanMapper(League.class)
    List<League> getListLeagues();
}
