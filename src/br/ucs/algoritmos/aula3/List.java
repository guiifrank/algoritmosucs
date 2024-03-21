package br.ucs.algoritmos.aula3;

public class List {
    private Node head;
    public void add(Double value) {
        Node node = new Node();
        node.setValue(value);
        node.setNext(head);
        head = node;
    }

    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                '}';
    }
}
