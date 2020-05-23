package com.footm.informationservice.resources;

import com.footm.informationservice.api.Nationality;
import com.footm.informationservice.db.NationalityDao;
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport;
import io.dropwizard.testing.junit5.ResourceExtension;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import javax.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(DropwizardExtensionsSupport.class)
class NationalityResourceTest {

    private static final NationalityDao dao = mock(NationalityDao.class);
    private static final ResourceExtension RULE = ResourceExtension.builder()
            .addResource(new NationalityResource(dao))
            .build();

    @AfterEach
    void tearDown() {
        reset(dao);
    }

    @Test
    void getListNationalitiesSuccess() {
        List<Nationality> nationalityList = new ArrayList<>();
        nationalityList.add(new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png"));
        nationalityList.add(new Nationality("Portugal", "https://cdn.sofifa.org/flags/38.png"));
        when(dao.getListNationalities()).thenReturn(nationalityList);

        List<Nationality> expectedNationalitiesList = RULE.target("/nationalities")
                .request()
                .get(new GenericType<List<Nationality>>() {
                });

        assertThat(expectedNationalitiesList.get(0)).isEqualTo(new Nationality("Argentina", "https://cdn.sofifa.org/flags/52.png"));
        assertThat(expectedNationalitiesList.get(1)).isEqualTo(new Nationality("Portugal", "https://cdn.sofifa.org/flags/38.png"));
        verify(dao).getListNationalities();
    }

}
