package com.codegile.week1.day2.problem2;

public class Employee implements Comparable<Employee> {

  private static int nextId = 1;

  private int id;
  private String name;
  private String surname;
  private String ssn;

  public Employee(String name, String surname, String ssn) {
    this.id = nextId++;
    this.name = name;
    this.surname = surname;
    this.ssn = ssn;
  }

  public boolean nameEqualsSurname() {
    return name.equals(surname);
  }

  public boolean isBornAfterYear(int yearSuffix) {
    return getBirthYear() >= yearSuffix;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getSsn() {
    return ssn;
  }

  public int getBirthYear() {
    return Integer.parseInt(ssn.substring(1, 3));
  }

  @Override
  public int compareTo(Employee o) {
    return this.getBirthYear() - o.getBirthYear();
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

}
