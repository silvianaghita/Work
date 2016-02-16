package com.codegile.week1.day2.problem1;

public class MyClass {

  int id;
  int number;

  public MyClass(int id, int number) {
    this.id = id;
    this.number = number;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + number;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    MyClass other = (MyClass) obj;
    if (id != other.id)
      return false;
    if (number != other.number)
      return false;
    return true;
  }
}
