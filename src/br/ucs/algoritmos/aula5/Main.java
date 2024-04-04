package br.ucs.algoritmos.aula5;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert("Alice", 7.5);
        list.insert("Bob", 6.8);
        list.insert("Charlie", 8.9);
        list.insert("David", 7.5);
        list.insert("Eve", 9.2);

        System.out.println("Students in the list:");
        list.display();
        System.out.println();

        list.removeByGrade(7.5);

        System.out.println("Students in the list after removing students with grade 7.5:");
        list.display();
        System.out.println();

        System.out.println("Average grade: " + list.getAverageGrade());
        list.displayStudentsAboveAverage();
        System.out.println();
        list.displayStudentsBelowAverage();
    }
}
