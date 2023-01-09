package com.training.galaxe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Regular_Employee")
@PrimaryKeyJoinColumn(name = "ID")
public class RegularEmployee extends Employee {

  @Column(name = "Salary")
  private float salary;

  @Column(name = "Bonus")
  private int bonus;

  public float getSalary() {
    return salary;
  }

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public int getBonus() {
    return bonus;
  }

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }
}
