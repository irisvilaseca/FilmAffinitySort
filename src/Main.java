import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Pelicula p1=new Pelicula("Star Wars",600,4.56);
        Pelicula p2=new Pelicula("Harry Potter",1300,8.40);
        Pelicula p3=new Pelicula("Los juegos del Hambre",7000,5.70);
        Pelicula p4=new Pelicula("E.T.",5600,6.23);
        Pelicules pelicules=new Pelicules(new ArrayList<>());
        pelicules.afegirPelicula(p1);
        pelicules.afegirPelicula(p2);
        pelicules.afegirPelicula(p3);
        pelicules.afegirPelicula(p4);
        pelicules.ordenaPerPuntuacioMitjanaAscendent();
        pelicules.mostrarPelicules(5000);


    }
}