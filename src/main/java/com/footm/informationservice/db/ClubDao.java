package com.footm.informationservice.db;

import com.footm.informationservice.api.Club;
import org.jdbi.v3.sqlobject.config.RegisterBeanMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

import java.util.List;

public interface ClubDao {

    @SqlQuery("Select club AS id, Logo from clubs")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubs();

    @SqlQuery("Select club AS id, Logo from clubs where league = :leagueId")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubsInLeague(@Bind("leagueId") String leagueId);

    @SqlQuery("Select club AS id, Logo from clubs where unaccent(club) ILIKE unaccent(:clubNamePattern)")
    @RegisterBeanMapper(Club.class)
    List<Club> getListClubsWithMatchingNamePatterns(@Bind("clubNamePattern") String clubNamePattern);

    @SqlQuery("Select club AS id, Logo from clubs where unaccent(club) = :clubId)")
    @RegisterBeanMapper(Club.class)
    Club getClubWithId(String clubId);
}
