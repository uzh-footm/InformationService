package com.footm.informationservice.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

public class NationalityTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializeToJson() throws Exception {
        final Nationality nationality = new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png");

        final String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture("fixtures/nationality.json"), Nationality.class));

        assertThat(MAPPER.writeValueAsString(nationality)).isEqualTo(expected);
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Nationality nationality = new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png");

        assertThat(MAPPER.readValue(fixture("fixtures/nationality.json"), Nationality.class))
                .isEqualTo(nationality);
    }
}
