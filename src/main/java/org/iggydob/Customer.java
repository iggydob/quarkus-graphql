package org.iggydob;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "test_table")
public class Customer extends BaseDomain {
    @NotNull
    private String fullName;
    private ZonedDateTime registered = ZonedDateTime.now();
}
