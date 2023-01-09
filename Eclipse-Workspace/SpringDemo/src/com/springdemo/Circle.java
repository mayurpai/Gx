package com.springdemo;

// import javax.annotation.Resource;

public class Circle {

  private Point center;

  public void draw() {
    System.out.println("Drawing Circle");
    System.out.println(
      "Circle: Point [ " + center.getX() + " , " + center.getY() + " ]"
    );
  }

  public Point getCenter() {
    return center;
  }

  //   @Resource(name = "pointC")
  //   @Resource() Will Search For Point with name center in applicationContext.xml
  public void setCenter(Point center) {
    this.center = center;
  }

  //   @PostConstruct
  public void initializeCircle() {
    System.out.println("Circle Initialized");
  }

  //   @PreDestroy
  public void destroyCircle() {
    System.out.println("Circle Destroyed");
  }

  @Override
  public String toString() {
    return "Circle [center=" + center + "]";
  }
}
