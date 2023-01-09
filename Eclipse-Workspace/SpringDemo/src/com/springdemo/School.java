package com.springdemo;

import java.util.HashMap;

public class School {

  private int schoolId;
  private String schoolName;
  private HashMap<Integer, Student> studentMap;

  @Override
  public String toString() {
    return (
      "School [schoolId=" +
      schoolId +
      ", schoolName=" +
      schoolName +
      ", studentMap=" +
      studentMap +
      "]"
    );
  }

  public School(
    int schoolId,
    String schoolName,
    HashMap<Integer, Student> studentMap
  ) {
    this.schoolId = schoolId;
    this.schoolName = schoolName;
    this.studentMap = studentMap;
  }

  public int getSchoolId() {
    return schoolId;
  }

  public void setSchoolId(int schoolId) {
    this.schoolId = schoolId;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public void setSchoolName(String schoolName) {
    this.schoolName = schoolName;
  }

  public HashMap<Integer, Student> getStudentMap() {
    return studentMap;
  }

  public void setStudentMap(HashMap<Integer, Student> studentMap) {
    this.studentMap = studentMap;
  }
}
