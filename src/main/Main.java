package main;

import utils.Input;

public class Main {
    public static void main(String[] args) {

        //Instanciando os objetos
        Catalogo catalogo = new Catalogo();
        Series Serie1 = new Series("Vikings", "Netflix");
        Series Smallvile = new Series(Input.st("Informe o nome da série:"));


        //nota
        if(!Serie1.setNota(Input.db("Informe a nota para a série "+Serie1.getNome() +": "))){
            System.out.println("Nota Inválida!");
        }
    }
}