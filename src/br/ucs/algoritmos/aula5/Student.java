package br.ucs.algoritmos.aula5;

public class Student {
    String name;
    double grade;
    Student next;
    Student prev;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        this.next = null;
        this.prev = null;
    }
}
