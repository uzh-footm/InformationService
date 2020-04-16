package com.footm.informationservice.db;

import com.footm.informationservice.api.Club;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import javax.ws.rs.QueryParam;
import java.util.List;

public interface ClubDao {

    @SqlQuery("Select club AS id, Logo from clubs")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubs();
}
