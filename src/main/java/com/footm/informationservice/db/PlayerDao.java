package com.footm.informationservice.db;

import com.footm.informationservice.api.Player;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface PlayerDao {

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight " +
            "from player where id == :id ")
    @RegisterBeanMapper(Player.class)
    Player getPlayer(@Bind("id") int id);
}
