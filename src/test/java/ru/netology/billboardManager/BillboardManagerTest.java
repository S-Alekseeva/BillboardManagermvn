package ru.netology.billboardManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BillboardManagerTest {
    BillboardManager manager = new BillboardManager();
    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";
    String movie6 = "movie6";
    String movie7 = "movie7";
    String movie8 = "movie8";
    String movie9 = "movie9";
    String movie10 = "movie10";

    @Test
    public void AddMovies() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void MoviesReverseLimit7() {
        BillboardManager manager = new BillboardManager(7);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);

        String[] expected = {
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void MoviesLessLimit() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

       @Test
    public void MoviesOverLimit5() {
        BillboardManager manager = new BillboardManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
        };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddNullMovies() {
        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LimitEqualLimit() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
                movie6,
                movie7,
                movie8,
                movie9,
                movie10,
        };
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}


