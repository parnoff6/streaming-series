package main;

public class Series {
    //atributos
    private String nome;
    private String plataforma;
    private double nota;

    //construtores

    public Series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
    }

    //métodos


    //toString
    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

}
