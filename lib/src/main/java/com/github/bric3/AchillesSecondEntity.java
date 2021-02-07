package com.github.bric3;

import info.archinnov.achilles.annotations.*;

@Table(table = "achilles_second_entity")
@Immutable
public class AchillesSecondEntity {

    @PartitionKey
    public final String key;

    @ClusteringColumn
    public final String clustering;

    @Column
    public final String url;

    public AchillesSecondEntity(String key, String clustering, String url) {
        this.key = key;
        this.clustering = clustering;
        this.url = url;
    }
}
