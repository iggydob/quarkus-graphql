package org.iggydob;

import io.ebean.DB;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@ApplicationScoped
public class TestRepository {


    public List<TestEntity> getAll() {
        return DB.find(TestEntity.class)
                .findList();
    }
}
