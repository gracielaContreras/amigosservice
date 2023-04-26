package org.example.customer.service;

import org.example.customer.models.Customer;
import org.example.customer.models.CustomerRegistrationRequest;
import org.example.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;
@Service
public record CustomerService(CustomerRepository customerRepository) {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db

        customerRepository.save(customer);
    }
}
