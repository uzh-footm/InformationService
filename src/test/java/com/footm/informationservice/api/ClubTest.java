package com.footm.informationservice.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

public class ClubTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializeToJson() throws Exception {
        final Club club = new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png");

        final String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture("fixtures/club.json"), Club.class));

        assertThat(MAPPER.writeValueAsString(club)).isEqualTo(expected);
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Club club = new Club("Chelsea", "https://cdn.sofifa.org/teams/2/light/5.png");

        assertThat(MAPPER.readValue(fixture("fixtures/club.json"), Club.class))
                .isEqualTo(club);
    }
}