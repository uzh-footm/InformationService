package com.footm.informationservice.resources;

import com.footm.informationservice.api.Player;
import com.footm.informationservice.api.PlayerFullSpecification;
import com.footm.informationservice.api.PlayerPositions;
import com.footm.informationservice.api.PlayerSkills;
import com.footm.informationservice.db.PlayerDao;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

/**
 * The class PlayerResourceTest test the resource(API) of URL /players. It uses Mockito to mock the db Interaction,
 * Junit5, AssertJ and small Jersey client to test the API, both the success and not found cases are tested.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
@ExtendWith(DropwizardExtensionsSupport.class)
class PlayerResourceTest {

    private static final PlayerDao dao = mock(PlayerDao.class);
    private static final ResourceExtension RULE = ResourceExtension.builder()
            .addResource(new PlayerResource(dao))
            .build();

    @AfterEach
    void tearDown() {
        reset(dao);
    }

    @Test
    void getPlayerSuccess() {
        Player player = new Player();
        when(dao.getPlayer(4)).thenReturn(player);

        Player expectedPlayer = RULE.target("/players")
                .path("4")
                .request()
                .get(Player.class);

        assertThat(expectedPlayer).isEqualTo(player);
        verify(dao).getPlayer(4);
    }

    @Test
    void getPlayerNotFound() {
        when(dao.getPlayer(4242)).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("4242")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayer(4242);
    }

    @Test
    void getPlayerSkillsSuccess() {
        PlayerSkills playerSkills = new PlayerSkills();
        when(dao.getPlayerSkills(4)).thenReturn(playerSkills);

        PlayerSkills expectedPlayerSkills = RULE.target("/players")
                .path("4")
                .path("skills")
                .request()
                .get(PlayerSkills.class);

        assertThat(expectedPlayerSkills).isEqualTo(playerSkills);
        verify(dao).getPlayerSkills(4);
    }

    @Test
    void getPlayerSkillsNotFound() {
        when(dao.getPlayerSkills(4242)).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("4242")
                .path("skills")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayerSkills(4242);
    }

    @Test
    void getPlayerPositionsSuccess() {
        PlayerPositions playerPositions = new PlayerPositions();
        when(dao.getPlayerPositions(4)).thenReturn(playerPositions);

        PlayerPositions expectedPlayerPositions = RULE.target("/players")
                .path("4")
                .path("positions")
                .request()
                .get(PlayerPositions.class);

        assertThat(expectedPlayerPositions).isEqualTo(playerPositions);
        verify(dao).getPlayerPositions(4);
    }

    @Test
    void getPlayerPositionsNotFound() {
        when(dao.getPlayerPositions(4242)).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("4242")
                .path("positions")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayerPositions(4242);
    }

    @Test
    void getPlayersInClubSuccess() {
        List<Player> playersInClub = new ArrayList<>();
        playersInClub.add(new Player());
        playersInClub.add(new Player());
        when(dao.getPlayersInClub("Chelsea")).thenReturn(playersInClub);

        List<Player> expectedPlayersInClub = RULE.target("/players")
                .path("club")
                .path("Chelsea")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedPlayersInClub).isEqualTo(playersInClub);
        verify(dao).getPlayersInClub("Chelsea");
    }

    @Test
    void getPlayersInClubNotFound() {
        when(dao.getPlayersInClub("No name club")).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("club")
                .path("No name club")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayersInClub("No name club");
    }

    @Test
    void getPlayersInNationalitySuccess() {
        List<Player> playersInNationality = new ArrayList<>();
        playersInNationality.add(new Player());
        playersInNationality.add(new Player());
        when(dao.getPlayersInNationality("Argentina")).thenReturn(playersInNationality);

        List<Player> expectedPlayersInNationality = RULE.target("/players")
                .path("nationality")
                .path("Argentina")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedPlayersInNationality).isEqualTo(playersInNationality);
        verify(dao).getPlayersInNationality("Argentina");
    }

    @Test
    void getPlayersInNationalityNotFound() {
        when(dao.getPlayersInClub("No name nationality")).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("nationality")
                .path("No name nationality")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayersInNationality("No name nationality");
    }

    @Test
    void getListPlayersWithMatchingNamePatternsSuccess() {
        List<Player> listPlayersWithMatchingNamePatterns = new ArrayList<>();
        listPlayersWithMatchingNamePatterns.add(new Player());
        when(dao.getListPlayersWithMatchingNamePatterns("%kaka%")).thenReturn(listPlayersWithMatchingNamePatterns);

        List<Player> expectedListPlayersWithMatchingNamePatterns = RULE.target("/players")
                .path("search")
                .path("kaka")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedListPlayersWithMatchingNamePatterns).isEqualTo(listPlayersWithMatchingNamePatterns);
        verify(dao).getListPlayersWithMatchingNamePatterns("%kaka%");
    }

    @Test
    void getPlayerWithFullSpecificationSuccess() {
        PlayerFullSpecification playerFullSpecification = new PlayerFullSpecification();
        when(dao.getPlayerWithFullSpecification(4)).thenReturn(playerFullSpecification);

        PlayerFullSpecification expectedPlayerFullSpecification = RULE.target("/players")
                .path("4")
                .path("full")
                .request()
                .get(PlayerFullSpecification.class);

        assertThat(expectedPlayerFullSpecification).isEqualTo(playerFullSpecification);
        verify(dao).getPlayerWithFullSpecification(4);
    }

    @Test
    void getPlayerWithFullSpecificationNotFound() {
        when(dao.getPlayerWithFullSpecification(4242)).thenReturn(null);

        Response expectedResponse = RULE.target("/players")
                .path("4242")
                .path("full")
                .request()
                .get();

        assertThat(expectedResponse.getStatusInfo()).isEqualTo(Response.Status.NOT_FOUND);
        verify(dao).getPlayerWithFullSpecification(4242);
    }

    @Test
    void testFilterPlayersWithSortNationalityPlayerPositionOvrGteOvrLteSuccess() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());

        List<String> playerPositions = new ArrayList<>();
        playerPositions.add("RW");

        when(dao.filterPlayersWithSortNationalityPlayerPositionOvrGteOvrLte("desc", "nationality", playerPositions, 40, 80)).thenReturn(playerList);

        List<Player> expectedResponse = RULE.target("/players")
                .queryParam("sort", "desc")
                .queryParam("nationality", "nationality")
                .queryParam("position", "RW")
                .queryParam("ovrGte", 40)
                .queryParam("ovrLte", 80)
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedResponse).isEqualTo(playerList);
        verify(dao).filterPlayersWithSortNationalityPlayerPositionOvrGteOvrLte("desc", "nationality", playerPositions, 40, 80);
    }

    @Test
    void filterPlayersWithSortOverGteOvrLteSuccess() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());
        when(dao.filterPlayersWithSortOverGteOvrLte("desc", 40, 80)).thenReturn(playerList);

        List<Player> expectedResponse = RULE.target("/players")
                .queryParam("sort", "desc")
                .queryParam("ovrGte", 40)
                .queryParam("ovrLte", 80)
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedResponse).isEqualTo(playerList);
        verify(dao).filterPlayersWithSortOverGteOvrLte("desc", 40, 80);
    }

    @Test
    void filterPlayersWithSortOverGteOvrLtNationalitySuccess() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());
        when(dao.filterPlayersWithSortOverGteOvrLtNationality("desc", 40, 80, "nationality")).thenReturn(playerList);

        List<Player> expectedResponse = RULE.target("/players")
                .queryParam("sort", "desc")
                .queryParam("ovrGte", 40)
                .queryParam("ovrLte", 80)
                .queryParam("nationality", "nationality")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedResponse).isEqualTo(playerList);
        verify(dao).filterPlayersWithSortOverGteOvrLtNationality("desc", 40, 80, "nationality");
    }

    @Test
    void filterPlayersWithSortOverGteOvrLtPositionSuccess() {
        List<Player> playerList = new ArrayList<>();
        playerList.add(new Player());

        List<String> playerPositions = new ArrayList<>();
        playerPositions.add("RW");
        playerPositions.add("ST");

        when(dao.filterPlayersWithSortOverGteOvrLtPosition("desc", 40, 80, playerPositions)).thenReturn(playerList);

        List<Player> expectedResponse = RULE.target("/players")
                .queryParam("sort", "desc")
                .queryParam("ovrGte", 40)
                .queryParam("ovrLte", 80)
                .queryParam("position", "RW")
                .queryParam("position", "ST")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedResponse).isEqualTo(playerList);
        verify(dao).filterPlayersWithSortOverGteOvrLtPosition("desc", 40, 80, playerPositions);
    }
}
