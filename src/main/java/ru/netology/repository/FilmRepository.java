package ru.netology.repository;

import ru.netology.domen.FilmItem;

public class FilmRepository {
    private FilmItem[] items = new FilmItem[0];
    private int countFilm = 10;


    public void addFilm(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;

    }

    public static int findAll(int[] items) {
        int[] allFilm = new int[items.length];
        int i;
        for (i = 0; i < items.length; i++) {

        }
        return allFilm[i];


    }

    public FilmItem[] getItems() {
        return items;
    }

    public FilmRepository() {

    }

    public FilmRepository(int size) {
        countFilm = size;
    }

    public FilmItem[] items(){
        FilmItem[] all = getItems();
        int resultLength;
        if (items.length < countFilm) {
            resultLength = items.length;
        } else {
            resultLength = countFilm;
        }
FilmItem[] result = new FilmItem[resultLength];
        for (int i =0; i < items.length; i++) {
            result[i] = all[items.length -1-i];
        }
        return result;
    }

}
