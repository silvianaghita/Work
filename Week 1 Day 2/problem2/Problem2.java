package com.codegile.week1.day2.problem2;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();

    Employee one = new Employee("Paul", "Hristea", "1951211080064");
    Employee two = new Employee("Alexandra", "Alexandra", "2801423478004");
    Employee three = new Employee("Daniel", "Georgescu", "1742572909934");
    Employee four = new Employee("Ana", "Hristea", "2790829389923");
    Employee five = new Employee("Ana", "Ana", "2881428390034");
    Employee six = new Employee("George", "George", "1681627893890");

    employees.add(one);
    employees.add(two);
    employees.add(three);
    employees.add(four);
    employees.add(five);
    employees.add(six);

    System.out.println("Employees born after 1980 :");
    for (Employee e : employees) {
      if (e.nameEqualsSurname() && e.isBornAfterYear(80)) {
        System.out.println(e.getId() + " " + e.getName() + " " + e.getSurname());
      }
    }

    System.out.println();
    System.out.println("Sorted employees :");
    employees.sort(new EmployeeComparator());
    for (Employee e : employees) {
      System.out.println(e.getId() + " " + e.getName() + " " + e.getSurname() + " (" + e.getBirthYear() + ")");
    }
  }

}
