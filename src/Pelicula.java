public class Pelicula implements Comparable<Pelicula>{
    private String titol;
    private int nVots;
    private double puntuacioMitjana;

    public Pelicula(String titol, int nVots, double puntuacioMitjana) {
        this.titol = titol;
        this.nVots = nVots;
        this.puntuacioMitjana = puntuacioMitjana;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getnVots() {
        return nVots;
    }

    public void setnVots(int nVots) {
        this.nVots = nVots;
    }

    public double getPuntuacioMitjana() {
        return puntuacioMitjana;
    }

    public void setPuntuacioMitjana(double puntuacioMitjana) {
        this.puntuacioMitjana = puntuacioMitjana;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titol='" + titol + '\'' +
                ", nVots=" + nVots +
                ", puntuacioMitjana=" + puntuacioMitjana +
                '}';
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        if(this.nVots==pelicula.nVots){
            return 0;
        }else if(this.nVots>pelicula.nVots){
            return -1;
        }else{
            return 1;
        }
    }
}
