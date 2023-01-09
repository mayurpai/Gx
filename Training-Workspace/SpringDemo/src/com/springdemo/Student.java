package com.springdemo;

import java.util.List;

public class Student {

  private int studentId;
  private String studentName;
  private List<Float> marks;

  public Student() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public String toString() {
    return (
      "Student [studentId=" +
      studentId +
      ", studentName=" +
      studentName +
      ", marks=" +
      marks +
      "]"
    );
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public List<Float> getMarks() {
    return marks;
  }

  public void setMarks(List<Float> marks) {
    this.marks = marks;
  }

  public Student(int studentId, String studentName, List<Float> marks) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.marks = marks;
  }

  public void displayInfo() {
    System.out.println("Hello " + studentName);
  }
}
