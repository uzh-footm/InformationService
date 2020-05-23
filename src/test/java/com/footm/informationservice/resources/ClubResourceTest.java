package com.footm.informationservice.resources;

import com.footm.informationservice.api.Club;
import com.footm.informationservice.db.ClubDao;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(DropwizardExtensionsSupport.class)
class ClubResourceTest {

    private static final ClubDao dao = mock(ClubDao.class);
    private static final ResourceExtension RULE = ResourceExtension.builder()
            .addResource(new ClubResource(dao))
            .build();

    @AfterEach
    void tearDown() {
        reset(dao);
    }


    @Test
    void getListClubsSuccess() {
        List<Club> clubList = new ArrayList<>();
        clubList.add(new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png"));
        clubList.add(new Club("Al Wehda", "https://cdn.sofifa.org/teams/2/light/112408.png"));
        when(dao.getListClubs()).thenReturn(clubList);

        List<Club> expectedClubs = RULE.target("/clubs")
                .request()
                .get(new GenericType<List<Club>>() {
                });

        assertThat(expectedClubs.get(0)).isEqualTo(new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png"));
        assertThat(expectedClubs.get(1)).isEqualTo(new Club("Al Wehda", "https://cdn.sofifa.org/teams/2/light/112408.png"));
        verify(dao).getListClubs();
    }

    @Test
    void getListClubsInLeagueSuccess() {
        List<Club> clubList = new ArrayList<>();
        clubList.add(new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png"));
        clubList.add(new Club("Bournemouth", "https://cdn.sofifa.org/teams/2/light/1943.png"));
        when(dao.getListClubsInLeague("English Premier League")).thenReturn(clubList);

        List<Club> expectedLeagues = RULE.target("/clubs")
                .path("league")
                .path("English Premier League")
                .request()
                .get(new GenericType<List<Club>>() {
                });

        assertThat(expectedLeagues.get(0)).isEqualTo(new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png"));
        assertThat(expectedLeagues.get(1)).isEqualTo(new Club("Bournemouth", "https://cdn.sofifa.org/teams/2/light/1943.png"));
        verify(dao).getListClubsInLeague("English Premier League");
    }

    @Test
    void getListClubsInLeagueNotFound() {
        when(dao.getListClubsInLeague("Non existing league")).thenReturn(null);

        Response expectedResponse = RULE.target("/clubs")
                .path("league")
                .path("Non existing league")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getListClubsInLeague("Non existing league");
    }

    @Test
    void getClubWithIdSuccess() {
        Club club = new Club();
        when(dao.getClubWithId("AC Horsens")).thenReturn(club);

        Club expectedClub = RULE.target("/clubs")
                .path("AC Horsens")
                .request()
                .get(Club.class);

        Assertions.assertThat(expectedClub).isEqualTo(club);
        verify(dao).getClubWithId("AC Horsens");
    }

    @Test
    void getClubWithIdNotFound() {
        when(dao.getClubWithId("BAD NAME")).thenReturn(null);

        Response expectedResponse = RULE.target("/clubs")
                .path("BAD NAME")
                .request()
                .get();

        Assertions.assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getClubWithId("BAD NAME");
    }

    @Test
    void getListPlayersWithMatchingNamePatternsSuccess() {
        List<Club> listClubsWithMatchingNamePatterns = new ArrayList<>();
        listClubsWithMatchingNamePatterns.add(new Club());
        when(dao.getListClubsWithMatchingNamePatterns("%madrid%")).thenReturn(listClubsWithMatchingNamePatterns);

        List<Club> expectedListClubsWithMatchingNamePatterns = RULE.target("/clubs")
                .path("search")
                .path("madrid")
                .request()
                .get(new GenericType<List<Club>>() {
                });

        Assertions.assertThat(expectedListClubsWithMatchingNamePatterns).isEqualTo(listClubsWithMatchingNamePatterns);
        verify(dao).getListClubsWithMatchingNamePatterns("%madrid%");
    }

}
