package com.footm.informationservice.db;

import com.footm.informationservice.api.League;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

/**
 * The interface LeagueDao uses the JDBI SQL Object API to communicate with DB, it takes advantage of mapping between
 * relations and object.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
public interface LeagueDao {

    @SqlQuery("Select league AS id from leagues")
    @RegisterBeanMapper(League.class)
    List<League> getListLeagues();
}
