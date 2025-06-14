package br.com.bank.service;

import br.com.bank.model.Customer;

import java.util.Optional;

public interface CustomerUseCase {
    void createCustomer(Customer customer);

    String sendRequest(String document);

    Optional<Customer> findByDocument(String document);
}
