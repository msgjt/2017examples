package de.msg.training.examples.passbyvalue;

public class PassAnObject {

  private String reference;


  public PassAnObject(final String parameter) {
    super();
    reference = parameter;
  }


  public boolean isItTheSameReference(String parameter) {
    boolean result = parameter == reference;
    parameter = "Hello girls";
    return result;
  }


  public String getReference() {
    return reference;
  }


  public static void main(final String args[]) {
    PassAnObject obj = new PassAnObject(new String("Hello boys"));

    System.out.println(obj.isItTheSameReference(obj.reference));
    System.out.println(obj.getReference());
  }
}
