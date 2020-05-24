package com.footm.informationservice.db;

import com.footm.informationservice.api.Club;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

/**
 * The interface ClubDao uses the JDBI SQL Object API to communicate with DB, it takes advantage of mapping between
 * relations and object.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
public interface ClubDao {

    @SqlQuery("Select club AS id, Logo from clubs")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubs();

    @SqlQuery("Select club AS id, Logo from clubs where unaccent(league) = unaccent(:leagueId)")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubsInLeague(@Bind("leagueId") String leagueId);

    @SqlQuery("Select club AS id, Logo from clubs where unaccent(club) ILIKE unaccent(:clubNamePattern) LIMIT 30")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubsWithMatchingNamePatterns(@Bind("clubNamePattern") String clubNamePattern);

    @SqlQuery("Select club AS id, Logo from clubs where unaccent(club) = unaccent(:clubId)")
    @RegisterBeanMapper(Club.class)
    Club getClubWithId(@Bind("clubId") String clubId);
}
