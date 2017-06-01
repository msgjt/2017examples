package de.msg.training.examples.immutable;

import java.util.Date;

public class ImmutableDate {

  public Date date;


  public ImmutableDate(final Date date) {
    this.date = date;
  }


  public Date getDate() {
    return date;
  }


  public void setDate(final Date date) {
    this.date = date;
  }

}
