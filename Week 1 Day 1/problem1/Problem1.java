package com.codegile.week1.day1.problem1;

import com.codegile.week1.day1.res.StringReader;

public class Problem1 {

  private static String[] getNums() {
    String[] lines = StringReader.getLines("fisier1.in");
    String[] nums = new String[0];

    for (String s : lines) {
      String[] subs = s.split("[,\\s]+");
      String[] aux = new String[nums.length + subs.length];
      System.arraycopy(nums, 0, aux, 0, nums.length);
      for (int i = 0; i < subs.length; i++) {
        aux[nums.length + i] = subs[i];
      }

      nums = aux;
    }

    return nums;
  }

  private static int isIntreg(String s) {
    if ((int) Double.parseDouble(s) == Double.parseDouble(s)) {
      return 1;
    }
    return 0;
  }

  private static int isReal(String s) {
    return 1 - isIntreg(s);
  }

  public static void main(String[] args) {
    int numOfIntregi = 0;
    int numOfReale = 0;
    String[] nums = getNums();

    for (String s : nums) {
      numOfIntregi += isIntreg(s);
      numOfReale += isReal(s);
    }

    System.out.println("Numar de intregi : " + numOfIntregi);
    System.out.println("Numar de reale : " + numOfReale);
  }

}