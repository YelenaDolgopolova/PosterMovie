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
//    @Test
//    public void CatalogMovie(){
//        MovieManager manager = new MovieManager();
//        int resultLength;
//
//    }
}
