package de.msg.training.examples.threads;

class Account {
  private int balance = 20;


  public int getBalance() {
    return balance;
  }


  public void withdraw(final int amount) {
    balance = balance - amount;
  }
}
