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
        this.nota = 0;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
        this.nota = 0;
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

    public double getNota() { return nota; }

    public void setNome(String nome) { this.nome = nome; }

    public void setPlataforma(String plataforma) { this.plataforma = plataforma; }

    public boolean setNota(double nota) {
        if (nota <= 10 && nota >= 0) {
            this.nota = nota;
            return true;
        } else {
            return false;
    }
    }

}
