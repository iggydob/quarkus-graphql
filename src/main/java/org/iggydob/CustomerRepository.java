package org.iggydob;

import io.ebean.Database;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.UUID;

@Slf4j
@ApplicationScoped
public class CustomerRepository {

    @Inject
    Database database;

    public List<Customer> getAll() {
        return database
                .find(Customer.class)
                .findList();
    }

    public Customer getById(UUID id) {
        return database.find(Customer.class, id);
    }

    public Customer create(Customer customer) {
        database.save(customer);
        return customer;
    }

    public Customer delete(UUID id) {
        Customer temporary = database.find(Customer.class, id);
        database.delete(Customer.class, id);
        return temporary;
    }

    public Customer update(UUID id, Customer customer) {
        Customer temporary = database.find(Customer.class, id);
        temporary.setFullName(customer.getFullName());
        database.save(temporary);
        return temporary;
    }
}
