package com.springdemo;

public class Triangle {

  private Point pointA;
  private Point pointB;
  private Point pointC;

  public Triangle() {}

  public Triangle(Point pointA, Point pointB, Point pointC) {
    this.pointA = pointA;
    this.pointB = pointB;
    this.pointC = pointC;
  }

  public Point getPointA() {
    return pointA;
  }

  public void setPointA(Point pointA) {
    this.pointA = pointA;
  }

  public Point getPointB() {
    return pointB;
  }

  public void setPointB(Point pointB) {
    this.pointB = pointB;
  }

  public Point getPointC() {
    return pointC;
  }

  public void setPointC(Point pointC) {
    this.pointC = pointC;
  }

  @Override
  public String toString() {
    return (
      "Traingle [pointA=" +
      pointA +
      ", pointB=" +
      pointB +
      ", pointC=" +
      pointC +
      "]"
    );
  }
}
