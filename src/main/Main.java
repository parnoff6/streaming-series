package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {
        Series Serie1 = new Series("Vikings", "Netflix");
        Series Smallvile = new Series(Input.st("Informe o nome da série:"));


        System.out.println(Serie1.toString());
        System.out.println(Smallvile.toString());

        double nota;
        nota = Input.db("Informe a nota que deseja para a série: "+Serie1.getNome() + "-");
        if(Serie1.setNota(nota)){
            System.out.println("Sua nota foi arquivada!");
        } else {
            System.out.println("Sua nota foi Inválida!");
        }

    }
}