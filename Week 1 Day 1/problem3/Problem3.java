package com.codegile.week1.day1.problem3;

import java.util.Arrays;

import com.codegile.week1.day1.res.StringReader;

public class Problem3 {

  private static String[] splitAndOrder(String[] lines) {
    String[] ordered = new String[0];

    for (String line : lines) {
      String[] words = line.split("[\\s,.?!]+");
      Arrays.sort(words);
      String[] aux = new String[ordered.length + words.length];
      System.arraycopy(ordered, 0, aux, 0, ordered.length);
      for (int i = 0; i < words.length; i++) {
        aux[ordered.length + i] = words[i];
      }
      ordered = aux;
    }

    return ordered;
  }

  private static String[] replaceVowels(String[] orderedWords) {
    String[] replaced = new String[orderedWords.length];

    for (int i = 0; i < orderedWords.length; i++) {
      String word = orderedWords[i];
      if (word.matches("[aeiouAEIOU][a-zA-Z]*")) {
        word = ((Integer) word.length()).toString();
      }
      replaced[i] = word;
    }

    return replaced;
  }

  public static void main(String[] args) {
    String[] lines = StringReader.getLines("fisier3.in");

    String[] orderedWords = splitAndOrder(lines);

    System.out.println("Cuvintele ordonate : ");
    for (String word : orderedWords) {
      System.out.print(word + " ");
    }
    System.out.println();

    String[] finalWords = replaceVowels(orderedWords);

    System.out.println("Cuvintele finale : ");
    for (String word : finalWords) {
      System.out.print(word + " ");
    }
    System.out.println();
  }

}
