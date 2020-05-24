package com.footm.informationservice.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;

import static io.dropwizard.testing.FixtureHelpers.fixture;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * The class NationalityTest, test the representations class Nationality by serialization and Deserialization JSON files
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
class NationalityTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    void serializeToJson() throws Exception {
        final Nationality nationality = new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png");

        final String expected = MAPPER.writeValueAsString(MAPPER.readValue(fixture("fixtures/Nationality.json"), Nationality.class));

        assertThat(MAPPER.writeValueAsString(nationality)).isEqualTo(expected);
    }

    @Test
    void deserializesFromJSON() throws Exception {
        final Nationality nationality = new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png");

        assertThat(MAPPER.readValue(fixture("fixtures/Nationality.json"), Nationality.class))
                .isEqualTo(nationality);
    }
}
