package com.vishal.microservice.beans;

public class User {

  private String name;
  private String empId;
  private String address;

  public User(String name, String empId, String address) {
    super();
    this.name = name;
    this.empId = empId;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmpId() {
    return empId;
  }

  public void setEmpId(String empId) {
    this.empId = empId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
