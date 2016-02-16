package com.codegile.week1.day1.problem4;

public class Shirt {
  private String id;
  private String description;
  private String color;
  private Size size;

  public Shirt(String id, String description, String color, Size size) {
    this.id = id;
    this.description = description;
    this.color = color;
    this.size = size;
  }

  @Override
  public String toString() {
    String text = "";
    text += "Shirt ID: " + id;
    text += "\nDescription: " + description;
    text += "\nColor: " + color;
    text += "\nSize: " + size + "\n";
    return text;
  }

}
