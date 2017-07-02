package de.msg.training.examples.threads;

public class Main {

  public static void main(final String[] args) {
    AccountManager r = new AccountManager();
    Thread mihai = new Thread(r);
    Thread maria = new Thread(r);
    mihai.setName("Mihai");
    maria.setName("Maria");
    mihai.start();
    maria.start();
  }

}
