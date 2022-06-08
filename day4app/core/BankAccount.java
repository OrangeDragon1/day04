package day4app.core;

import java.util.UUID;

public class BankAccount {

    private String accountId = UUID.randomUUID().toString().substring(0,8);
    private String name;

    public BankAccount(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
