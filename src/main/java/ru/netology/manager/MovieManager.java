package ru.netology.manager;

import ru.netology.domain.CatalogMovie;

public class MovieManager {
    private CatalogMovie[] movies = new CatalogMovie[0];
    private int limit = 10;

    public MovieManager() {
    }

    public MovieManager(int lim) {
        if (lim < limit) {
            this.limit = lim;
        } else this.limit = 10;
    }

    public void add(CatalogMovie movie) {
        // создаём новый массив размером на единицу больше
        int length = movies.length + 1;
        CatalogMovie[] tmp = new CatalogMovie[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public CatalogMovie[] getAll() {
        CatalogMovie[] result = new CatalogMovie[movies.length];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

    // наивная реализация
    public void removeById(int id) {
        int length = movies.length - 1;
        CatalogMovie[] tmp = new CatalogMovie[length];
        int index = 0;
        for (CatalogMovie movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }
        }
        // меняем наши элементы
        movies = tmp;
    }

    public CatalogMovie[] getLast() {

        int resultLength = movies.length + 1;
        if (movies.length > limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        CatalogMovie[] result = new CatalogMovie[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = result.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}



