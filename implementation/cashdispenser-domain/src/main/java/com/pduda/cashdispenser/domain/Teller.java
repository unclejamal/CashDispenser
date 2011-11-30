package com.pduda.cashdispenser.domain;

public class Teller {

  private ICashDispenser cashDispenser;
  private Account account;

  public Teller(ICashDispenser cashDispenser) {
    this.cashDispenser = cashDispenser;
  }

  public void authenticateAs(Account account) {
    this.account = account;
  }

  public void withdraw(double amount) {
    account.decreaseBalance(amount);
    cashDispenser.dispense(amount);
  }

}
