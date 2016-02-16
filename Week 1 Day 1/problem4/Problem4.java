package com.codegile.week1.day1.problem4;

import com.codegile.week1.day1.res.StringReader;

public class Problem4 {

  public static void main(String[] args) {
    String input = StringReader.getLines("fisier4.in")[0];
    String[] components = input.split(", ");
    int numOfShirts = components.length / 4;
    Shirt[] shirts = new Shirt[numOfShirts];

    for (int i = 0; i < numOfShirts; i++) {
      String id = components[i * 4];
      String description = components[i * 4 + 1];
      String color = components[i * 4 + 2];
      Size size = Size.valueOf(components[i * 4 + 3]);

      shirts[i] = new Shirt(id, description, color, size);
    }

    for (Shirt s : shirts) {
      System.out.println(s);
    }
  }

}
