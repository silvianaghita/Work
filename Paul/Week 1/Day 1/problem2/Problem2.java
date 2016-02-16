package com.codegile.week1.day1.problem2;

import com.codegile.week1.day1.res.StringReader;

public class Problem2 {

  private static boolean namesAreValid(String[] names) {
    for (String name : names) {
      if (!name.matches("[a-zA-Z]+")) {
        return false;
      }
      String idealName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
      if (!name.equals(idealName)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int numOfValidNames = 0;
    String[] lines = StringReader.getLines("fisier2.in");

    for (String line : lines) {
      String[] names = line.split(" ");
      if (names.length < 2) {
        continue;
      }
      if (namesAreValid(names)) {
        numOfValidNames++;
      }
    }

    System.out.println("Numar de nume valide : " + numOfValidNames);
  }

}
