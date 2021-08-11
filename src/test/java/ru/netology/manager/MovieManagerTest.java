package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CatalogMovie;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerTest {
    @Test
    public void shouldRemoveIfExists() {
        MovieManager manager = new MovieManager();
        int idToRemove = 1;
        CatalogMovie first = new CatalogMovie(1, 1, "Бладшот", 1, 1);
        CatalogMovie second = new CatalogMovie(2, 2, "Вперед", 1, 1);
        CatalogMovie third = new CatalogMovie(3, 3, "Отель Белград", 1, 1);
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        CatalogMovie[] actual = manager.getAll();
        CatalogMovie[] expected = new CatalogMovie[]{third, second};

        //    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldShowCatalogMovieAboveLim() {
        MovieManager manager = new MovieManager();

        CatalogMovie first = new CatalogMovie(1, 1, "Бладшот", 1, 1);
        CatalogMovie second = new CatalogMovie(2, 2, "Вперед", 1, 1);
        CatalogMovie third = new CatalogMovie(3, 3, "Отель Белград", 1, 1);
        CatalogMovie four = new CatalogMovie(4, 4, "Джентельмены", 1, 1);
        CatalogMovie five = new CatalogMovie(5, 5, "Человек невидимка", 1, 1);
        CatalogMovie six = new CatalogMovie(6, 6, "Тролли", 1, 1);
        CatalogMovie seven = new CatalogMovie(7, 7, "Номер один", 1, 1);
        CatalogMovie eight = new CatalogMovie(8, 8, "Поезд в Пусан", 1, 1);
        CatalogMovie nine = new CatalogMovie(9, 9, "Револьвер", 1, 1);
        CatalogMovie ten = new CatalogMovie(10, 10, "Гнев человеческий", 1, 1);
        CatalogMovie eleven = new CatalogMovie(11, 11, "Чернобыль", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);
        manager.add(eleven);

        manager.getLast();

        CatalogMovie[] actual = manager.getLast();
        CatalogMovie[] expected = new CatalogMovie[]{ten, nine, eight, seven, six, five, four,
                third, second, first};

        //    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldShowCatalogMovieBelowMLim() {
        MovieManager manager = new MovieManager();

        CatalogMovie first = new CatalogMovie(1, 1, "Бладшот", 1, 1);
        CatalogMovie second = new CatalogMovie(2, 2, "Вперед", 1, 1);
        CatalogMovie third = new CatalogMovie(3, 3, "Отель Белград", 1, 1);
        CatalogMovie four = new CatalogMovie(4, 4, "Джентельмены", 1, 1);
        CatalogMovie five = new CatalogMovie(5, 5, "Человек невидимка", 1, 1);
        CatalogMovie six = new CatalogMovie(6, 6, "Тролли", 1, 1);
        CatalogMovie seven = new CatalogMovie(7, 7, "Номер один", 1, 1);
        CatalogMovie eight = new CatalogMovie(8, 8, "Поезд в Пусан", 1, 1);
        CatalogMovie nine = new CatalogMovie(9, 9, "Револьвер", 1, 1);
        CatalogMovie ten = new CatalogMovie(10, 10, "Гнев человеческий", 1, 1);
        CatalogMovie eleven = new CatalogMovie(11, 11, "Чернобыль", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.getLast();

        CatalogMovie[] actual = manager.getLast();
        CatalogMovie[] expected = new CatalogMovie[]{third, second, first};

        //    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowLimCatalogMovie() {
        MovieManager manager = new MovieManager();

        CatalogMovie first = new CatalogMovie(1, 1, "Бладшот", 1, 1);
        CatalogMovie second = new CatalogMovie(2, 2, "Вперед", 1, 1);
        CatalogMovie third = new CatalogMovie(3, 3, "Отель Белград", 1, 1);
        CatalogMovie four = new CatalogMovie(4, 4, "Джентельмены", 1, 1);
        CatalogMovie five = new CatalogMovie(5, 5, "Человек невидимка", 1, 1);
        CatalogMovie six = new CatalogMovie(6, 6, "Тролли", 1, 1);
        CatalogMovie seven = new CatalogMovie(7, 7, "Номер один", 1, 1);
        CatalogMovie eight = new CatalogMovie(8, 8, "Поезд в Пусан", 1, 1);
        CatalogMovie nine = new CatalogMovie(9, 9, "Револьвер", 1, 1);
        CatalogMovie ten = new CatalogMovie(10, 10, "Гнев человеческий", 1, 1);
        CatalogMovie eleven = new CatalogMovie(11, 11, "Чернобыль", 1, 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(four);
        manager.add(five);
        manager.add(six);
        manager.add(seven);
        manager.add(eight);
        manager.add(nine);
        manager.add(ten);

        manager.getLast();

        CatalogMovie[] actual = manager.getLast();
        CatalogMovie[] expected = new CatalogMovie[]{ten, nine, eight, seven, six, five, four,
                third, second, first};

        //    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

}
