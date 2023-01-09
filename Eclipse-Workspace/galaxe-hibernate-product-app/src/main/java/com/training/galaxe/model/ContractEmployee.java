package com.training.galaxe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Contract_Employee")
@PrimaryKeyJoinColumn(name = "ID")
public class ContractEmployee extends Employee {

  @Column(name = "Pay_Per_Hour")
  private float payPerHour;

  @Column(name = "Contract_Duration")
  private String contractDuration;

  public float getPayPerHour() {
    return payPerHour;
  }

  public void setPayPerHour(float payPerHour) {
    this.payPerHour = payPerHour;
  }

  public String getContractDuration() {
    return contractDuration;
  }

  public void setContractDuration(String contractDuration) {
    this.contractDuration = contractDuration;
  }
}
