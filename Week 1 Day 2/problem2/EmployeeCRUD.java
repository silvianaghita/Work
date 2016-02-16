package com.codegile.week1.day2.problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeCRUD {

  private static List<Employee> employees = new ArrayList<>();

  public static void createEmployee(Employee e) {
    employees.add(e);
  }

  public static Employee readEmployee() {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    String surname = sc.nextLine();
    String ssn = sc.nextLine();

    return new Employee(name, surname, ssn);
  }

  public static void updateEmployee(int id) {
    Employee updating = null;

    for (Employee e : employees) {
      if (e.getId() == id) {
        System.out.println("Updating employee : " + e.getName() + " " + e.getSurname() + " " + e.getSsn());
        updating = e;
      }
    }

    if (updating == null) {
      System.out.println("Employee ID not found!");
      return;
    }

    System.out.println("What do you want to update?");
    System.out.println("1) Name");
    System.out.println("2) Surname");
    System.out.println("3) SSN");
    System.out.print("\tOption : ");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    sc.nextLine();

    switch (choice) {
    case 1:
      System.out.print("Enter new name : ");
      String name = sc.nextLine();
      updating.setName(name);
      break;
    case 2:
      System.out.print("Enter new surname : ");
      String surname = sc.nextLine();
      updating.setSurname(surname);
      break;
    case 3:
      System.out.print("Enter new SSN : ");
      String ssn = sc.nextLine();
      updating.setSsn(ssn);
      break;
    }
  }

  public static void deleteEmployee(int id) {
    for (Employee e : employees) {
      if (e.getId() == id) {
        employees.remove(e);
      }
    }
  }

  public static void main(String[] args) {
    createEmployee(readEmployee());
    createEmployee(new Employee("Dana", "Corcodela", "2973645637485"));
    createEmployee(new Employee("Paul", "Hristea", "1951211080064"));

    updateEmployee(1);

    deleteEmployee(2);

    System.out.println("Employee list :");
    for (Employee e : employees) {
      System.out.println(e.getId() + " " + e.getName() + " " + e.getSurname());
    }
  }

}
