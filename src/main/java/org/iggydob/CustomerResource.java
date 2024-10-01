package org.iggydob;

import io.ebean.annotation.WhenModified;
import jakarta.inject.Inject;
import jakarta.persistence.Column;
import jakarta.validation.Valid;
import org.eclipse.microprofile.graphql.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@GraphQLApi
public class CustomerResource {

    @Inject
    CustomerRepository customerRepository;

    @Mutation("createCustomer")
    @Description("Create new Customer.")
    public Customer create(Customer customer) {
        return customerRepository.create(customer);
    }

    @Query("getAllCustomers")
    @Description("Gets all customers from DB.")
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Query("getCustomerById")
    @Description("Gets a single customer by id.")
    public Customer getById(UUID id) {
        return customerRepository.getById(id);
    }

    @Mutation("deleteCustomer")
    public Customer delete(UUID id) {
        return customerRepository.delete(id);
    }

    @Mutation("updateCustomer")
    @Description("Update customer details")
    public Customer updateById(
            @Valid Customer customer,
            @Name("id") UUID id) {
        return customerRepository.update(id, customer);
    }

    private ZonedDateTime registered;
}