public class Buch {
    private String Titel;
    private String Genre;
    private String Autor;
    private double Preis;
    private int Seitenanzahl;

    public Buch(String titel, String genre, String autor, double preis, int seitenanzahl) {
        Titel = titel;
        Genre = genre;
        Autor = autor;
        Preis = preis;
        Seitenanzahl = seitenanzahl;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "Titel='" + Titel + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Preis=" + Preis +
                ", Seitenanzahl=" + Seitenanzahl +
                '}';
    }
    public String getTitel(){
        return Titel;
    }
    public String getGenre(){
        return Genre;
    }
    public String getAutor(){
        return Autor;
    }
    public double getPreis(){
        return Preis;
    }
    public int getSeitenanzahl(){
        return Seitenanzahl;
    }
}
