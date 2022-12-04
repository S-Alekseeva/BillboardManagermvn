package ru.netology.billboardManager;

public class BillboardManager {

    private String[] movies = new String[0];
    private int limit;

    public BillboardManager() {
        limit = 10;
    }

    public BillboardManager(int limit) {
        this.limit = limit;
    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        String[] result = new String[limit];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }

    public String[] addOverLimit() {
        String[] overLimit = new String[limit];
        for (int i = 0; i < overLimit.length; i++) {
            overLimit[i] = movies[i];
        }
        return overLimit;
    }
}


