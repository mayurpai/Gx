package com.springdemo;

public class Point {

  private float X;
  private float Y;

  public Point(float X, float Y) {
    this.X = X;
    this.Y = Y;
  }

  public float getX() {
    return X;
  }

  public void setX(float X) {
    this.X = X;
  }

  public float getY() {
    return Y;
  }

  public void setY(float Y) {
    this.Y = Y;
  }

  @Override
  public String toString() {
    return "Point [X=" + X + ", Y=" + Y + "]";
  }
}
