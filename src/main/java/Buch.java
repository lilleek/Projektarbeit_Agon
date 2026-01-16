public class Buch { //Klasse Buch
    private String Titel; //Attribute
    private String Genre;
    private String Autor;
    private double Preis;
    private int Seitenanzahl;

    public Buch(String titel, String genre, String autor, int preis, int seitenanzahl) { //Konstrukto
        Titel = titel;
        Genre = genre;
        Autor = autor;
        Preis = preis;
        Seitenanzahl = seitenanzahl;
    }



    @Override
    public String toString() { //Ausgabe in der JList
        return "Dein Buch:" +
                 Titel + " | " +
                 Genre + " | " +
                  Autor + " | " +
                  Preis + " | "+
                  Seitenanzahl;
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
