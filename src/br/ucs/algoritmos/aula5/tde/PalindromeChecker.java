package br.ucs.algoritmos.aula5.tde;

public class PalindromeChecker {

    static class Node {
        char data;
        Node next, prev;

        Node(char d) {
            data = d;
            next = prev = null;
        }
    }

    static class Header {
        int totalChars;
        int totalWords;

        Header() {
            totalChars = 0;
            totalWords = 0;
        }
    }

    static class DoublyLinkedList {
        Node head;
        Header header;

        DoublyLinkedList() {
            head = null;
            header = new Header();
        }

        void append(char new_data) {
            Node new_node = new Node(new_data);
            header.totalChars++;
            if (head == null) {
                head = new_node;
                return;
            }
            Node last = head;
            while (last.next != null)
                last = last.next;
            last.next = new_node;
            new_node.prev = last;
        }

        void calculateWords(String text) {
            if (text == null || text.isEmpty())
                return;

            char[] charArray = text.toCharArray();
            boolean isWord = false;

            for (char c : charArray) {
                if (Character.isLetterOrDigit(c)) {
                    if (!isWord) {
                        header.totalWords++;
                        isWord = true;
                    }
                } else {
                    isWord = false;
                }
            }
        }

        int isPalindrome() {
            Node front = head;
            Node end = head;

            while (end.next != null)
                end = end.next;

            while (front != null && end != null) {
                if (front.data != end.data)
                    return 0;
                front = front.next;
                end = end.prev;
            }
            return 1;
        }
    }
}

