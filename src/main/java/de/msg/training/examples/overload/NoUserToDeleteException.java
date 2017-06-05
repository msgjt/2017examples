package de.msg.training.examples.overload;

@SuppressWarnings("serial")
public class NoUserToDeleteException extends Exception {

  public NoUserToDeleteException(final String message) {
    super(message);
  }

}
