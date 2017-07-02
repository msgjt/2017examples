package de.msg.training.examples.equalshashcode;

import java.util.Date;

public class Key {

  private final Integer simulationId;

  private final Integer contractId;

  private final Date date;


  public Key(final Integer simulationId, final Integer contractId, final Date date) {
    super();
    this.simulationId = simulationId;
    this.contractId = contractId;
    this.date = date;
  }


  public Integer getSimulationId() {
    return simulationId;
  }


  public Integer getContractId() {
    return contractId;
  }


  public Date getDate() {
    return date;
  }

}
