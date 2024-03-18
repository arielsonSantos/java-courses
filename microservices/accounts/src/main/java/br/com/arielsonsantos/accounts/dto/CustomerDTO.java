package br.com.arielsonsantos.accounts.dto;

import br.com.arielsonsantos.accounts.entity.Customer;

public class CustomerDTO {

    private String name;

    private String email;

    private String mobileNumber;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(final String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Customer toEntity() {
        Customer customer = new Customer();
        customer.setName(getName());
        customer.setEmail(getEmail());
        customer.setMobileNumber(getMobileNumber());
        return customer;
    }
}
