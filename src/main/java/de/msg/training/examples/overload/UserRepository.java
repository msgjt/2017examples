package de.msg.training.examples.overload;

import static de.msg.training.examples.overload.User.*;

public class UserRepository {

  public User findUserBy(final String userName) {
    return EMPTY_USER;
  }


  public User findUserBy(final Integer id) {
    return EMPTY_USER;
  }


  public void deleteUser(final User user) throws NoUserToDeleteException {
    // to be implemented
  }


  public void deleteUser(final Integer id) throws NoUserToDeleteException {
    // to be implemented
  }


  public void updateUser(final User user) throws NoUserToUpdateException {
    // to be implemented
  }

}
