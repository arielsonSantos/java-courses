package br.com.arielsonsantos.accounts.service;

import br.com.arielsonsantos.accounts.dto.CustomerDTO;
import br.com.arielsonsantos.accounts.entity.Customer;
import br.com.arielsonsantos.accounts.repository.CustomerRepository;

public class CustomerService {

    private CustomerRepository customerRepository;

    public Customer createCustomer(final CustomerDTO customerDTO) {
        final Customer customer = customerDTO.toEntity();
        return customerRepository.save(customer);
    }
}
