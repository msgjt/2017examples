package de.msg.training.examples.enums;

public enum CoffeeSize {

  SMALL(100),
  MEDIUM(200),
  BIG(300),
  UNKNOWN(-1) {

    @Override
    public int getSize() {
      throw new IllegalArgumentException("Unknown size");
    }

  };

  private int size;


  CoffeeSize(final int size) {
    this.size = size;
  }


  public int getSize() {
    return size;
  }
}
