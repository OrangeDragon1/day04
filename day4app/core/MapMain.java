package day4app.core;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        BankAccount acct;

        List<String> names = new LinkedList<>();
        Collections.addAll(names, "fred", "barney", "kiki", "may");

        for (String accName: names) {
            BankAccount acct = new BankAccount(accName);
        }
        BankAccount fred = new BankAccount("fred");
        BankAccount barney = new BankAccount("barney");
        BankAccount kiki = new BankAccount("kiki");
        BankAccount may = new BankAccount("may");
        
        // Creat a simple map
        Map<String, BankAccount> accts = new HashMap<>();
        accts.put(fred.getAccountId(), fred);
        accts.put(barney.getAccountId(), barney);
        accts.put(kiki.getAccountId(), kiki);
        accts.put(may.getAccountId(), may);

        System.out.printf("size:%d\n", accts.size());
        System.out.printf("has fred: %b\n", accts.containsKey(fred.getAccountId()));
        System.out.printf("has pebbles: %b\n", accts.containsKey("pebbles"));

        Set<String> keys = accts.keySet();
        Collection<BankAccount> values = accts.values();
        
        for (String acctId: keys) {
            acct = accts.get(acctId);
            System.out.printf("acctid = %s. acctname = %s\n", acctId,acct.getName());

        }

    }
}