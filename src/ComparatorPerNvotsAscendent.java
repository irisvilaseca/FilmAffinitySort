import java.util.Comparator;

public class ComparatorPerNvotsAscendent implements Comparator<Pelicula> {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        if(p1.getnVots()==p2.getnVots()){
            return 0;
        }else if(p1.getnVots()<p2.getnVots()){
            return -1;
        }else{
            return 1;
        }
    }
}
