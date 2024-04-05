import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Pelicules {
    private ArrayList<Pelicula> pelicules = new ArrayList<Pelicula>();
    final private int MIN_VOTS_DEFAULT=5000;
    public Pelicules(ArrayList<Pelicula> pelicules) {
        this.pelicules = pelicules;
    }

    public ArrayList<Pelicula> getPelicules() {
        return pelicules;
    }

    public void setPelicules(ArrayList<Pelicula> pelicules) {
        this.pelicules = pelicules;
    }
    public ArrayList<Pelicula> afegirPelicula(Pelicula pelicula){
        pelicules.add(pelicula);
        return pelicules;
    }
    public void ordenaPerNvots(){
        Collections.sort(pelicules);
    }
    public void ordenaPerNVotsAscendent(){
        Collections.sort(pelicules, new ComparatorPerNvotsAscendent());
    }
    public void ordenaPerPuntuacioMitjanaDescendent(){
        Collections.sort(pelicules,new ComparatorPerPuntuacioMitjanaDescendent());
    }
    public void ordenaPerPuntuacioMitjanaAscendent(){
        Collections.sort(pelicules,new ComparatorPerPuntuacioMitjanaAscendent());
    }
    public void mostrarPelicules(int minim){
        int len= pelicules.size();
        for (Pelicula p:pelicules
             ) {
            if(p.getnVots()>minim){
                System.out.println(p);
            }

        }
    }
}
