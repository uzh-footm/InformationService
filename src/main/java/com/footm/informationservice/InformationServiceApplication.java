package com.footm.informationservice;

import com.footm.informationservice.db.ClubDao;
import com.footm.informationservice.db.LeagueDao;
import com.footm.informationservice.db.NationalityDao;
import com.footm.informationservice.db.PlayerDao;
import com.footm.informationservice.resources.ClubResource;
import com.footm.informationservice.resources.LeagueResource;
import com.footm.informationservice.resources.NationalityResource;
import com.footm.informationservice.resources.PlayerResource;
import io.dropwizard.Application;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.jdbi.v3.core.Jdbi;

public class InformationServiceApplication extends Application<InformationServiceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new InformationServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "InformationService";
    }

    @Override
    public void initialize(final Bootstrap<InformationServiceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final InformationServiceConfiguration configuration,
                    final Environment environment) {


        //database
        final JdbiFactory factory = new JdbiFactory();
        final Jdbi jdbi = factory.build(environment, configuration.getDataSourceFactory(), "postgresql");

        PlayerDao playerDao = jdbi.onDemand(PlayerDao.class);
        ClubDao clubDao = jdbi.onDemand(ClubDao.class);
        NationalityDao nationalityDao = jdbi.onDemand(NationalityDao.class);
        LeagueDao leagueDao = jdbi.onDemand(LeagueDao.class);


        environment.jersey().register(new PlayerResource(playerDao));
        environment.jersey().register(new ClubResource(clubDao));
        environment.jersey().register(new NationalityResource(nationalityDao));
        environment.jersey().register(new LeagueResource(leagueDao));


    }

}
