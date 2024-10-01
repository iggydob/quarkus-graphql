package org.iggydob;

import jakarta.inject.Inject;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

import java.util.List;

@GraphQLApi
public class TestResource {

    @Inject
    TestRepository testRepository;

    @Query
    @Description("Gets all entities from DB.")
    public List<TestEntity> getAll() {
        return testRepository.getAll();
    }

}
