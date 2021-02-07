package com.github.bric3;

import com.datastax.driver.core.Cluster;
import info.archinnov.achilles.configuration.ConfigurationParameters;
import info.archinnov.achilles.generated.ManagerFactoryBuilder;

import java.util.Map;

@ShouldBeProcessed
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    private void buildManager() {
        ManagerFactoryBuilder.build(
                Cluster.builder()
                       .addContactPoint("127.0.0.1")
                       .build(),
                Map.of(ConfigurationParameters.KEYSPACE_NAME, "dd")
        );
    }
}
