package com.pduda.cashdispenser.keywords;

import com.pduda.cashdispenser.domain.ICashDispenser;

public class FakeCashDispenser implements ICashDispenser {
  
  public double contents;

  public double getContents() {
    return contents;
  }

  public void dispense(double amount) {
    contents = amount;
  }
}