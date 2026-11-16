package main;



import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    //Atributos
    private List<Series> seriesArrayList = new ArrayList<>();

    //Métodos
    public void addSerie(Series serie){
        this.seriesArrayList.add(serie);
    }

    public Series buscarSerie (String serie){
        for (Series s : seriesArrayList){
            if(s.getNome().toLowerCase().equals(serie.toLowerCase())){
                return s;
            }
        }
        return null;
    }
}
