package com.paw.ArtyParty.Repository;

import com.paw.ArtyParty.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, String> {
    List<Customer> findByPhoneNumber(String phoneNumber);
}
