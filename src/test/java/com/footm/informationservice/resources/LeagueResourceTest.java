package com.footm.informationservice.resources;

import com.footm.informationservice.api.League;
import com.footm.informationservice.db.LeagueDao;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(DropwizardExtensionsSupport.class)
class LeagueResourceTest {

    private static final LeagueDao dao = mock(LeagueDao.class);
    private static final ResourceExtension RULE = ResourceExtension.builder()
            .addResource(new LeagueResource(dao))
            .build();

    private List<League> leagues;

    @BeforeEach
    void setup() {
        League argentinaLeague = new League("Argentina Primera División");
        League chineseSuperLeague = new League("Chinese Super League");

        leagues = new ArrayList<>();
        leagues.add(argentinaLeague);
        leagues.add(chineseSuperLeague);
    }

    @AfterEach
    void tearDown() {
        reset(dao);
    }

    @Test
    void getListLeaguesSuccess() {
        when(dao.getListLeagues()).thenReturn(leagues);

        List<League> expectedLeagues = RULE.target("/leagues")
                .request()
                .get(new GenericType<List<League>>() {
                });

        assertThat(expectedLeagues.get(0)).isEqualTo(new League("Argentina Primera División"));
        assertThat(expectedLeagues.get(1)).isEqualTo(new League("Chinese Super League"));
        verify(dao).getListLeagues();
    }
}