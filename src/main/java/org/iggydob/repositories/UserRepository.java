package org.iggydob.repositories;

import io.ebean.Database;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.iggydob.enumeration.RoleType;
import org.iggydob.models.User;

import java.util.List;
import java.util.UUID;

@Slf4j
@ApplicationScoped
public class UserRepository {

    @Inject
    Database database;

    public User create(User user) {
        user.setIsNotLocked(false);
        user.setRole(RoleType.ROLE_USER);
        database
                .save(user);
        return user;
    }

    public List<User> getAll() {
        return database
                .find(User.class)
                .findList();
    }

    public User getById(UUID id) {
        return database
                .find(User.class, id);
    }

    public User delete(UUID id) {
        User temp = getById(id);
        database.delete(temp);
        return temp;
    }
}
