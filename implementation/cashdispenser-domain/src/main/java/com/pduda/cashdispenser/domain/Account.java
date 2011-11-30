package com.pduda.cashdispenser.domain;

public class Account {

  private double balance;

  public void decreaseBalance(double amount) {
    balance -= amount;        
  }
  
  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;    
  }
  
}
