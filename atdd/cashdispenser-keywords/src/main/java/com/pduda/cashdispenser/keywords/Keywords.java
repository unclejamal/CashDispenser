package com.pduda.cashdispenser.keywords;

import com.pduda.cashdispenser.domain.Account;
import com.pduda.cashdispenser.domain.ICashDispenser;
import com.pduda.cashdispenser.domain.Teller;

public class Keywords {

  /** Create new 'Account'. */
  public Account myAccount(double balance) {
    Account account = new Account();
    account.setBalance(balance);
    return account;
  }

  /** Withdraw 'amount' from 'account' by using 'cashDispenser'. */
  public void withdraw(double amount, Account account, ICashDispenser cashDispenser) {
    Teller teller = new Teller(cashDispenser);
    teller.authenticateAs(account);
    teller.withdraw(amount);
  }

  /** Create new 'ICashDispenser'. */
  public ICashDispenser cashDispenser() {
    return new FakeCashDispenser();
  }
}
