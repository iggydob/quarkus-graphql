package org.iggydob.models;

import io.ebean.annotation.SoftDelete;
import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

import java.time.ZonedDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseDomain {
    @Id
    private UUID id;

    @WhenCreated
    @Column(name = "when_created")
    private ZonedDateTime whenCreated;

    @WhenModified
    @Column(name = "when_modified")
    private ZonedDateTime whenModified;

    @Version
    private Long version;

    @SoftDelete
    private boolean deleted;
}
