package com.rays.Collection.Comparable;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(String name, int id) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
       
        if (this.name.equals(o.name)) {
            return id - o.id;
        } else {
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public String toString() {
        return (id + " " + name);
    }
}
