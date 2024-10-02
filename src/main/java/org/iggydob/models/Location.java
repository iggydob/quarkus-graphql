package org.iggydob.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.iggydob.enumeration.Countries;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "locations")
public class Location extends BaseDomain {
    private String address;
    private String city;

    @Enumerated(EnumType.STRING)
    private Countries country;
}
