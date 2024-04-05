import java.util.Comparator;

public class ComparatorPerPuntuacioMitjanaDescendent implements Comparator<Pelicula> {

    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if(p1.getPuntuacioMitjana()== p2.getPuntuacioMitjana()){
            return 0;
        }else if(p1.getPuntuacioMitjana()>p2.getPuntuacioMitjana()){
            return -1;
        }else{
            return 1;
        }
    }
}
