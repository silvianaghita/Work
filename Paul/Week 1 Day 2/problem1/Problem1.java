package com.codegile.week1.day2.problem1;

public class Problem1 {

  public static void main(String[] args) {
    MyHashMap<MyClass, String> map = new MyHashMap<>();

    MyClass one = new MyClass(1, 40);
    MyClass two = new MyClass(2, 12);
    MyClass three = new MyClass(3, 45);
    MyClass four = new MyClass(4, 33);
    MyClass five = new MyClass(5, 17);

    map.put(one, "First string");
    map.put(two, "Second string");
    map.put(three, "Third string");
    map.put(four, "Fourth string");
    map.put(five, "Fifth string");

    MyClass search = new MyClass(1, 40);

    System.out.println(map.get(search));

    search = new MyClass(4, 33);

    System.out.println(map.get(search));

    search = new MyClass(5, 100);

    System.out.println(map.get(search));
  }
}
