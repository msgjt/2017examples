package de.msg.training.examples.operators;

public class ConditionalOperator {

  public static void main(final String args[]) {

    Object resultIfTrue = conditionalOperator(300, true);
    Object resultIfFalse = conditionalOperator(300, false);

    System.out.println(resultIfTrue.getClass());
    System.out.println(resultIfFalse.getClass());

  }


  private static Object conditionalOperator(final int value, final boolean bool) {
    return bool ? new Long(value) : new Double(value);
  }

}
