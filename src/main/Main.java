package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        Series Vikings = new Series("Vikings", "Netflix");
        Series Smallvile = new Series(Input.st("Informe o nome da série:"));


        System.out.println(Vikings.toString());
        System.out.println(Smallvile.toString());

    }
}