package com.codegile.week1.day2.problem2;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

  @Override
  public int compare(Employee o1, Employee o2) {
    return o1.getBirthYear() - o2.getBirthYear();
  }

}
