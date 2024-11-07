package com.example.map;

import java.util.LinkedList;

class CustomHashMap {
    private static class Entry {
        int key; // Use the employee ID as the key
        Employee value;
        
        Entry(int key, Employee value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] table;
    private int capacity = 16; // Initial capacity

    public CustomHashMap() {
        table = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void put(int key, Employee value) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                entry.value = value; // Update existing employee
                return;
            }
        }
        table[index].add(new Entry(key, value)); // Add new employee
    }

    public Employee get(int key) {
        int index = hash(key);
        for (Entry entry : table[index]) {
            if (entry.key == key) {
                return entry.value; // Return employee if found
            }
        }
        return null; // Not found
    }

    public void remove(int key) {
        int index = hash(key);
        table[index].removeIf(entry -> entry.key == key);
    }
}
