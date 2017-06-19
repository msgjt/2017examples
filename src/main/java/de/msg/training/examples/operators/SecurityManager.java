package de.msg.training.examples.operators;

import static de.msg.training.examples.operators.Permission.*;

public class SecurityManager {

  public static void main(final String args[]) {

    byte permissionFromDB = 7;

    hasRight(permissionFromDB, CHANGE_PASSWORD);
    hasRight(permissionFromDB, DELETE_USER);
    hasRight(permissionFromDB, CREATE_USER);

  }


  private static void hasRight(final byte permissionToCheck, final Permission permission) {
    if ((permissionToCheck & permission.getValue()) != 0)
      System.out.println(permission.name() + " yes");
    else
      System.out.println(permission.name() + " no");
  }

}
