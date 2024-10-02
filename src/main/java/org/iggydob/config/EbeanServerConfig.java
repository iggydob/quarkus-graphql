package org.iggydob.config;

import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.config.EncryptKeyManager;
import io.ebean.datasource.DataSourceConfig;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.iggydob.models.AddressBook;
import org.iggydob.models.Location;
import org.iggydob.models.User;

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
//        config.setEncryptKeyManager(keyManager);

        // explicitly register the entity beans to avoid classpath scanning
        config.addClass(User.class);
        config.addClass(Location.class);
        config.addClass(AddressBook.class);

        // create database instance
        return DatabaseFactory.create(config);
    }
}