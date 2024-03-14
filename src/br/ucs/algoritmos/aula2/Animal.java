package br.ucs.algoritmos.aula2;

public class Animal {
    private String name;
    private int num;

    public Animal(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}
