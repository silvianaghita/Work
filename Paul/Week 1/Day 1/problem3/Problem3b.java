package com.codegile.week1.day1.problem3;

import com.codegile.week1.day1.res.StringReader;

public class Problem3b {

  public static void main(String[] args) {
    String[] lines = StringReader.getLines("fisier3b.in");
    int numOfMatchingWords = 0;

    for (String line : lines) {
      line = line.replaceAll("\\s+", " ");

      line = line.replaceAll("(<p>)|(<P>)", "<span>");
      line = line.replaceAll("(</p>)|(</P>)", "</span>");

      System.out.println(line);

      for (String word : line.split(" ")) {
        if (word.matches("(a*ba*ba*)+")) {
          System.out.println(word);
          numOfMatchingWords++;
        }
      }
    }

    System.out.println("Cuvinte de forma corecta : " + numOfMatchingWords);
  }

}
