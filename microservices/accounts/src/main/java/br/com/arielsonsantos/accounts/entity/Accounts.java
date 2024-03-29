package br.com.arielsonsantos.accounts.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Accounts extends BaseEntity {

    @Id
    private String accountNumber;

    private String accountType;

    private Long customerId;

    private String branchAddress;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(final String accountType) {
        this.accountType = accountType;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(final Long customerId) {
        this.customerId = customerId;
    }

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(final String branchAddress) {
        this.branchAddress = branchAddress;
    }

    @Override
    public String toString() {
        return "Accounts [accountNumber=" + accountNumber + ", accountType=" + accountType + ", customerId=" + customerId + ", branchAddress=" + branchAddress + "]";
    }
}
