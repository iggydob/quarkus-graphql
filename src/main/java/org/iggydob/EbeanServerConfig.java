package org.iggydob;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.datasource.DataSourceConfig;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class EbeanServerConfig {

    @ConfigProperty(name = "datasource.db.username")
    String username;

    @ConfigProperty(name = "datasource.db.password")
    String password;

    @ConfigProperty(name = "datasource.db.url")
    String databaseUrl;

    @ConfigProperty(name = "datasource.db.databaseDriver")
    String databaseDriver;

    @ApplicationScoped
    public Database database() {
        // datasource
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUsername(username);
        dataSourceConfig.setPassword(password);
        dataSourceConfig.setUrl(databaseUrl);
        dataSourceConfig.setDriver(databaseDriver);

        // configuration
        DatabaseConfig config = new DatabaseConfig();
        config.setDataSourceConfig(dataSourceConfig);

        // create database instance
        return DatabaseFactory.create(config);
    }
}