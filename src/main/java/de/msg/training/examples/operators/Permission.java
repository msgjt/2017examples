package de.msg.training.examples.operators;

public enum Permission {

  CREATE_USER((byte) 4), // 100
  DELETE_USER((byte) 2), // 010
  CHANGE_PASSWORD((byte) 1); // 010

  private byte flag;


  private Permission(final byte flag) {
    this.flag = flag;
  }


  public byte getValue() {
    return flag;
  }

}
