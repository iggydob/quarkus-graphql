package org.iggydob.controllers;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;
import org.iggydob.models.User;
import org.iggydob.repositories.UserRepository;

import java.util.List;
import java.util.UUID;

@GraphQLApi
public class UserResource {

    @Inject
    UserRepository userRepository;

    @Mutation("createUser")
    @Description("Create new User.")
    public User create(User user) {
        return userRepository.create(user);
    }

    @Query("getAllUsers")
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Query("getUserById")
    public User getUserById(UUID id) {
        return userRepository.getById(id);
    }

    @Mutation("deleteUser")
    public User deleteUser(UUID id) {
        return userRepository.delete(id);
    }
}