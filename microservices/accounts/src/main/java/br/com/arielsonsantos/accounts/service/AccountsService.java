package br.com.arielsonsantos.accounts.service;

import java.util.Random;

import br.com.arielsonsantos.accounts.dto.CustomerDTO;
import br.com.arielsonsantos.accounts.entity.Accounts;
import br.com.arielsonsantos.accounts.entity.Customer;
import br.com.arielsonsantos.accounts.repository.AccountsRepository;

public class AccountsService {

    private static final String SAVINGS_ACCOUNT = "savings";

    private static final String BRANCH_ADDRESS = "1 Hacker Way";

    private AccountsRepository accountsRepository;

    private CustomerService customerService;

    public AccountsService(AccountsRepository accountsRepository, CustomerService customerService) {
        this.accountsRepository = accountsRepository;
        this.customerService = customerService;
    }

    public void createAccount(CustomerDTO customerDTO) {
        accountsRepository.save(createNewAccount(customerService.createCustomer(customerDTO)));
    }

    private Accounts createNewAccount(Customer customer) {
        Accounts accounts = new Accounts();
        accounts.setCustomerId(customer.getId());
        accounts.setAccountType(SAVINGS_ACCOUNT);
        accounts.setBranchAddress(BRANCH_ADDRESS);
        accounts.setAccountNumber(createAccountNumber());
        return accounts;
    }

    private String createAccountNumber() {
        Long randomAccountNumber = 1000000000L + new Random().nextInt(900000000);
        return randomAccountNumber.toString();
    }
}
