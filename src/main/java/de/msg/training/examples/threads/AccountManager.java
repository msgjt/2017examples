package de.msg.training.examples.threads;

public class AccountManager implements Runnable {

  private Account account = new Account();


  public void run() {
    for (int x = 0; x < 5; x++) {
      makeWithdrawal(10);
      if (account.getBalance() < 0)
        System.out.println("account is overdrawn!");
    }
  }


  private void makeWithdrawal(final int amt) {
    if (account.getBalance() >= amt) {
      System.out.println(Thread.currentThread().getName()
                         + " is going to withdraw");
      try {
        Thread.sleep(500);
      }
      catch (InterruptedException ex) {
      }
      account.withdraw(amt);
      System.out.println(Thread.currentThread().getName()
                         + " completes the withdrawal");
    }
    else
      System.out.println("Not enough in account for "
                         + Thread.currentThread().getName()
                         + " to withdraw " + account.getBalance());
  }

}
