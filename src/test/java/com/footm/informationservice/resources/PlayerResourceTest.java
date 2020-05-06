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
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

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

        Player expectedPlayer = RULE.target("/player")
                .path("4")
                .request()
                .get(Player.class);

        assertThat(expectedPlayer).isEqualTo(player);
        verify(dao).getPlayer(4);
    }

    @Test
    void getPlayerSkillsSuccess() {
        PlayerSkills playerSkills = new PlayerSkills();
        when(dao.getPlayerSkills(4)).thenReturn(playerSkills);

        PlayerSkills expectedPlayerSkills = RULE.target("/player")
                .path("4")
                .path("skills")
                .request()
                .get(PlayerSkills.class);

        assertThat(expectedPlayerSkills).isEqualTo(playerSkills);
        verify(dao).getPlayerSkills(4);
    }

    @Test
    void getPlayerPositionsSuccess() {
        PlayerPositions playerPositions = new PlayerPositions();
        when(dao.getPlayerPositions(4)).thenReturn(playerPositions);

        PlayerPositions expectedPlayerPositions = RULE.target("/player")
                .path("4")
                .path("positions")
                .request()
                .get(PlayerPositions.class);

        assertThat(expectedPlayerPositions).isEqualTo(playerPositions);
        verify(dao).getPlayerPositions(4);
    }

    @Test
    void getPlayersInClubSuccess() {
        List<Player> playersInClub = new ArrayList<>();
        playersInClub.add(new Player());
        playersInClub.add(new Player());
        when(dao.getPlayersInClub("Chelsea")).thenReturn(playersInClub);

        List<Player> expectedPlayersInClub = RULE.target("/player")
                .path("club")
                .path("Chelsea")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedPlayersInClub).isEqualTo(playersInClub);
        verify(dao).getPlayersInClub("Chelsea");
    }

    @Test
    void getPlayersInNationalitySuccess() {
        List<Player> playersInNationality = new ArrayList<>();
        playersInNationality.add(new Player());
        playersInNationality.add(new Player());
        when(dao.getPlayersInNationality("Argentina")).thenReturn(playersInNationality);

        List<Player> expectedPlayersInNationality = RULE.target("/player")
                .path("nationality")
                .path("Argentina")
                .request()
                .get(new GenericType<List<Player>>() {
                });

        assertThat(expectedPlayersInNationality).isEqualTo(playersInNationality);
        verify(dao).getPlayersInNationality("Argentina");
    }

    @Test
    void getListPlayersWithMatchingNamePatternsSuccess() {
        List<Player> listPlayersWithMatchingNamePatterns = new ArrayList<>();
        listPlayersWithMatchingNamePatterns.add(new Player());
        when(dao.getListPlayersWithMatchingNamePatterns("%kaka%")).thenReturn(listPlayersWithMatchingNamePatterns);

        List<Player> expectedListPlayersWithMatchingNamePatterns = RULE.target("/player")
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

        PlayerFullSpecification expectedPlayerFullSpecification = RULE.target("/player")
                .path("4")
                .path("full")
                .request()
                .get(PlayerFullSpecification.class);

        assertThat(expectedPlayerFullSpecification).isEqualTo(playerFullSpecification);
        verify(dao).getPlayerWithFullSpecification(4);
    }
}
