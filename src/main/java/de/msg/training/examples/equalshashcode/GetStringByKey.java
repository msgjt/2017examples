package de.msg.training.examples.equalshashcode;

import java.util.Date;
import java.util.HashMap;

public class GetStringByKey {

  private static final HashMap<Key, String> hashMap = new HashMap<Key, String>();


  public static void main(final String args[]) {

    Date date = new Date();
    Key key = createKey(10, 11, date);

    hashMap.put(key, new String("I am the value"));

    String value = hashMap.get(createKey(10, 11, date));

    System.out.println(value);

  }


  private static Key createKey(final int simulationId, final int contractId, final Date date) {
    return new Key(simulationId, contractId, date);
  }

}
