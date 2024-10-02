package org.iggydob.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.iggydob.enumeration.RoleType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(schema = "public", name = "users")
public class User extends BaseDomain {
    private String title;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String password;

    @Column(name = "is_not_locked")
    private Boolean isNotLocked;

    @OneToOne(cascade = CascadeType.ALL)
    private AddressBook address;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    @Enumerated(EnumType.STRING)
    private RoleType role;
}
