package com.footm.informationservice.db;

import com.footm.informationservice.api.Player;
import com.footm.informationservice.api.PlayerFullSpecification;
import com.footm.informationservice.api.PlayerPositions;
import com.footm.informationservice.api.PlayerSkills;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.customizer.BindList;
import org.jdbi.v3.sqlobject.customizer.Define;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

/**
 * The interface PlayerDao uses the JDBI SQL Object API to communicate with DB, it takes advantage of mapping between
 * relations and object.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
public interface PlayerDao {

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player where id = :id ")
    @RegisterBeanMapper(Player.class)
    Player getPlayer(@Bind("id") int id);

    @SqlQuery("select id,name,crossing,finishing,headingAccuracy," +
            "shortPassing,volleys,dribbling,curve,fkAccuracy," +
            "longPassing,ballControl,acceleration,sprintSpeed," +
            "agility,reactions,balance,shotPower,jumping,stamina," +
            "strength,longshots,aggression,interceptions,positioning," +
            "vision,penalties,composure,marking,standingTackle,slidingTackle," +
            "gkDiving,gkHandling,gkKicking,gkPositioning,gkReflexes from player where id = :id ")
    @RegisterBeanMapper(PlayerSkills.class)
    PlayerSkills getPlayerSkills(@Bind("id") int id);

    @SqlQuery("select id, name, LS ,ST , RS , LW,LF ,CF ,RF ,RW ,LAM ,CAM ,RAM ,LM ,LCM ,CM ,RCM ,RM ,LWB ,LDM ,CDM ,RDM ,RWB ,LB ,LCB ," +
            "CB , RCB ,RB from player where id = :id ")
    @RegisterBeanMapper(PlayerPositions.class)
    PlayerPositions getPlayerPositions(@Bind("id") int id);

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player where unaccent(club) = unaccent(:clubId) ")
    @RegisterBeanMapper(Player.class)
    List<Player> getPlayersInClub(@Bind("clubId") String clubId);

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player where unaccent(Nationality) = unaccent(:nationalityId) ")
    @RegisterBeanMapper(Player.class)
    List<Player> getPlayersInNationality(@Bind("nationalityId") String nationalityId);

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player where unaccent(name) ILIKE unaccent(:playerNamePattern) LIMIT 30 ")
    @RegisterBeanMapper(Player.class)
    List<Player> getListPlayersWithMatchingNamePatterns(@Bind("playerNamePattern") String playerNamePattern);

    @SqlQuery("select * from player where id = :id")
    @RegisterBeanMapper(PlayerFullSpecification.class)
    PlayerFullSpecification getPlayerWithFullSpecification(@Bind("id") int id);

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player " +
            "where position IN (<playerPositions>) " +
            "AND unaccent(nationality) = unaccent(:nationality) " +
            "AND overall >= :ovrGte " +
            "AND overall <= :ovrLte " +
            "ORDER BY overall <sort> " +
            "LIMIT 30")
    @RegisterBeanMapper(Player.class)
    List<Player> filterPlayersWithSortNationalityPlayerPositionOvrGteOvrLte(@Define("sort") String sort, @Bind("nationality")
            String nationality, @BindList("playerPositions") List<String> playerPositions, @Bind("ovrGte") int ovrGte, @Bind("ovrLte") int ovrLte);

    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player " +
            "where overall >= :ovrGte " +
            "AND overall <= :ovrLte " +
            "ORDER BY overall <sort> " +
            "LIMIT 30")
    @RegisterBeanMapper(Player.class)
    List<Player> filterPlayersWithSortOverGteOvrLte(@Define("sort") String sort, @Bind("ovrGte") int ovrGte, @Bind("ovrLte") int ovrLte);


    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player " +
            "where unaccent(nationality) = unaccent(:nationality) " +
            "AND overall >= :ovrGte " +
            "AND overall <= :ovrLte " +
            "ORDER BY overall <sort> " +
            "LIMIT 30")
    @RegisterBeanMapper(Player.class)
    List<Player> filterPlayersWithSortOverGteOvrLtNationality(@Define("sort") String sort, @Bind("ovrGte") int ovrGte, @Bind("ovrLte") int ovrLte, @Bind("nationality") String nationality);


    @SqlQuery("select id,name,age,photo,nationality,overall,club," +
            "value,wage,preferredfoot,skillmoves,workrate," +
            "position,jerseynumber,height,weight,releaseClause " +
            "from player " +
            "where position IN (<playerPositions>) " +
            "AND overall >= :ovrGte " +
            "AND overall <= :ovrLte " +
            "ORDER BY overall <sort> " +
            "LIMIT 30")
    @RegisterBeanMapper(Player.class)
    List<Player> filterPlayersWithSortOverGteOvrLtPosition(@Define("sort") String sort, @Bind("ovrGte") int ovrGte, @Bind("ovrLte") int ovrLte, @BindList("playerPositions") List<String> playerPositions);
}
