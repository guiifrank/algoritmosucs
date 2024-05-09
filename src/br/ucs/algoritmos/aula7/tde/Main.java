package br.ucs.algoritmos.aula7.tde;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        char[] input = {'A', '1', 'E', '5', 'T', '7', 'W', '8', 'G'};

        char[] result = rearrange(input);
        System.out.println("Resultado: ");
        for (char ch : result) {
            System.out.print(ch + " ");
        }
    }

    public static char[] rearrange(char[] input) {
        Queue<Character> lettersQueue = new LinkedList<>();
        Stack<Character> digitsStack = new Stack<>();

        for (char ch : input) {
            if (digito(ch)) {
                digitsStack.push(ch);
            } else {
                lettersQueue.add(ch);
            }
        }

        char[] result = new char[input.length];
        boolean startWithLetter = !digitsStack.isEmpty();
        int index = 0;
        while (!lettersQueue.isEmpty()) {
            result[index++] = lettersQueue.poll();
        }
        while (!digitsStack.isEmpty()) {
            result[index++] = digitsStack.pop();
        }

        if (!startWithLetter) {
            reverse(result, 0, index - 1);
        }

        return result;
    }

    public static boolean digito(char ch) {
        return Character.isDigit(ch);
    }

    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
