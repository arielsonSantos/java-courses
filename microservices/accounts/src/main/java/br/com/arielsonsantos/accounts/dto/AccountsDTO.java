package br.com.arielsonsantos.accounts.dto;

import br.com.arielsonsantos.accounts.entity.Accounts;

public class AccountsDTO {

    private String accountNumber;

    private String accountType;

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

    public String getBranchAddress() {
        return branchAddress;
    }

    public void setBranchAddress(final String branchAddress) {
        this.branchAddress = branchAddress;
    }

    public Accounts toEntity() {
        Accounts accounts = new Accounts();
        accounts.setAccountNumber(getAccountNumber());
        accounts.setAccountType(getAccountType());
        accounts.setBranchAddress(getBranchAddress());
        return accounts;
    }
}
