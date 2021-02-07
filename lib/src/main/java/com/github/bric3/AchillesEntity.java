package com.github.bric3;

import info.archinnov.achilles.annotations.*;

@Table(table = "achilles_entity")
@Immutable
public class AchillesEntity {

    @PartitionKey
    public final String key;

    @ClusteringColumn
    public final String clustering;

    @Column
    public final String url;

    public AchillesEntity(String key, String clustering, String url) {
        this.key = key;
        this.clustering = clustering;
        this.url = url;
    }
}
