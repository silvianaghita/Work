package com.codegile.week1.day2.problem1;

import java.util.LinkedList;

public class MyHashMap<K, V> {

  private static final int SIZE = 3;
  private LinkedList<K>[] keys;
  private LinkedList<V>[] values;

  @SuppressWarnings("unchecked")
  public MyHashMap() {
    keys = new LinkedList[SIZE];
    values = new LinkedList[SIZE];
  }

  public void put(K key, V value) {
    int index = key.hashCode() % SIZE;
    if (keys[index] == null) {
      keys[index] = new LinkedList<>();
      values[index] = new LinkedList<>();
    }
    LinkedList<K> keyBucket = keys[index];
    LinkedList<V> valueBucket = values[index];
    V oldValue = null;
    for (int i = 0; i < keyBucket.size(); i++) {
      if (key.equals(keyBucket.get(i))) {
        oldValue = valueBucket.get(i);
        oldValue = value;
      }
    }
    if (oldValue == null) {
      keyBucket.add(key);
      valueBucket.add(value);
    }
  }

  public V get(K key) {
    int index = key.hashCode() % SIZE;
    LinkedList<K> keyBucket = keys[index];
    LinkedList<V> valueBucket = values[index];

    for (int i = 0; i < keyBucket.size(); i++) {
      if (keyBucket.get(i).equals(key)) {
        return valueBucket.get(i);
      }
    }

    return null;
  }
}
