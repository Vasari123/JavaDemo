package com.example.arrayList;

class CustomArrayList {
    private Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public CustomArrayList() {
        employees = new Employee[INITIAL_CAPACITY];
        size = 0;
    }

    private void ensureCapacity() {
        if (size == employees.length) {
            Employee[] newArray = new Employee[employees.length * 2];
            System.arraycopy(employees, 0, newArray, 0, employees.length);
            employees = newArray;
        }
    }

    public void add(Employee employee) {
        ensureCapacity();
        employees[size++] = employee;
    }

    public Employee get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return employees[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        System.arraycopy(employees, index + 1, employees, index, size - index - 1);
        employees[--size] = null; // Avoid memory leak
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(employees[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
