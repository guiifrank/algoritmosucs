package br.ucs.algoritmos.aula5;

public class DoublyLinkedList {
    private Student header;
    private int totalStudents;
    private double totalGrade;

    public DoublyLinkedList() {
        header = new Student("", 0.0);
        totalStudents = 0;
        totalGrade = 0.0;
    }

    public void insert(String name, double grade) {
        Student newStudent = new Student(name, grade);
        Student current = header.next;
        totalStudents++;
        totalGrade += grade;

        if (current == null || grade < current.grade) {
            newStudent.next = current;
            if (current != null)
                current.prev = newStudent;
            header.next = newStudent;
            newStudent.prev = header;
            return;
        }

        while (current.next != null && current.next.grade <= grade) {
            current = current.next;
        }

        newStudent.next = current.next;
        if (current.next != null)
            current.next.prev = newStudent;
        current.next = newStudent;
        newStudent.prev = current;
    }

    public void removeByGrade(double grade) {
        Student current = header.next;

        while (current != null) {
            if (current.grade == grade) {
                if (current.prev != null)
                    current.prev.next = current.next;
                if (current.next != null)
                    current.next.prev = current.prev;
                totalGrade -= grade;
                totalStudents--;
            }
            current = current.next;
        }
    }

    public void display() {
        Student current = header.next;
        while (current != null) {
            System.out.println("Name: " + current.name + ", Grade: " + current.grade);
            current = current.next;
        }
    }

    public double getAverageGrade() {
        if (totalStudents == 0)
            return 0.0;
        return totalGrade / totalStudents;
    }

    public void displayStudentsAboveAverage() {
        double average = getAverageGrade();
        Student current = header.next;

        System.out.println("Students with grades above average:");

        while (current != null) {
            if (current.grade > average) {
                System.out.println("Name: " + current.name + ", Grade: " + current.grade);
            }
            current = current.next;
        }
    }

    public void displayStudentsBelowAverage() {
        double average = getAverageGrade();
        Student current = header.next;

        System.out.println("Students with grades below average:");

        while (current != null) {
            if (current.grade < average) {
                System.out.println("Name: " + current.name + ", Grade: " + current.grade);
            }
            current = current.next;
        }
    }
}
