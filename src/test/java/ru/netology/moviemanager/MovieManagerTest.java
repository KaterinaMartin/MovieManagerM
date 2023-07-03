package ru.netology.moviemanager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void addMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film one");

        String[] expected = { "Film one" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesI() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film one");
        manager.addMovie("Film two");
        manager.addMovie("Film three");

        String[] expected = { "Film one", "Film two", "Film three" };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoviesII() {
        MovieManager manager = new MovieManager();

        String[] expected = {  };
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film one");
        manager.addMovie("Film two");
        manager.addMovie("Film three");

        String[] expected = { "Film three", "Film two", "Film one" };
        String[] actual = manager.findLast(3);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastMovieI() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Film one");
        manager.addMovie("Film two");
        manager.addMovie("Film three");
        manager.addMovie("Film four");
        manager.addMovie("Film five");

        String[] expected = { "Film five", "Film four", "Film three", "Film two", "Film one" };
        String[] actual = manager.findLast(6);
        Assertions.assertArrayEquals(expected, actual);
    }
}