package ru.netology.domen;
public class FilmItem {
    private int id;
    private String filmName;
    private String genre;

    public FilmItem(int id, String filmName, String genre) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

}