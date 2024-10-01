package org.iggydob;

import io.ebean.annotation.WhenCreated;
import io.ebean.annotation.WhenModified;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.ZonedDateTime;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseDomain {
    @Id
    private UUID id;

    @WhenCreated
    private ZonedDateTime whenCreated;

    @WhenModified
    private ZonedDateTime whenModified;
}
