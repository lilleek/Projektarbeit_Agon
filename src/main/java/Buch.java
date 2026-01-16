public class Buch {
    private String Titel;
    private String Genre;
    private String Autor;
    private double Preis;
    private int Seitenanzahl;

    public Buch(String titel, String genre, String autor, int preis, int seitenanzahl) {
        Titel = titel;
        Genre = genre;
        Autor = autor;
        Preis = preis;
        Seitenanzahl = seitenanzahl;
    }

    public Buch(String titel, String autor, String seitenanzahl, String preis, String seitenanzahl1) {
    }

    public Buch(String titel, String autor, int seitenanzahl, String s, int seitenanzahl1) {
    }

    public static void addElement(Buch opeinilMeriva) {
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
