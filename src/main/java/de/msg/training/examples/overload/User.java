package de.msg.training.examples.overload;

import java.util.Vector;

public class User {

  public static User EMPTY_USER = new User();

  private Integer id;

  private String userName;

  private String firstName;

  private String lastName;

  private Vector<Character> password;


  private User() {
    // private constructor for empty User - instead of null
  }


  public User(final Integer id, final String userName, final String firstName, final String lastName,
              final Vector<Character> password) {
    super();
    this.id = id;
    this.userName = userName;
    this.firstName = firstName;
    this.lastName = lastName;
    this.password = password;
  }


  public Integer getId() {
    return id;
  }


  public String getUserName() {
    return userName;
  }


  public String getFirstName() {
    return firstName;
  }


  public String getLastName() {
    return lastName;
  }


  public Vector<Character> getPassword() {
    return password;
  }


  public void setId(final Integer id) {
    this.id = id;
  }


  public void setUserName(final String userName) {
    this.userName = userName;
  }


  public void setFirstName(final String firstName) {
    this.firstName = firstName;
  }


  public void setLastName(final String lastName) {
    this.lastName = lastName;
  }


  public void setPassword(final Vector<Character> password) {
    this.password = password;
  }

}
