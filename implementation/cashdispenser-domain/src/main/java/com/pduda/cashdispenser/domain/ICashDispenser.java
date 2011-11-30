package com.pduda.cashdispenser.domain;

public interface ICashDispenser {

  double getContents();

  void dispense(double amount);

}