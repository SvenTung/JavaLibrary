import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FireTest {

    private Fire fire;
    private Book book;
    private Book book2;
    private Book book3;
    private ArrayList<Book> fuel;
    private Library library;
    private ArrayList<Book> books;

    @Before
    public void before() {
        book = new Book("Blaze", "Stephen King", "Crime");
        book2 = new Book("The Fall", "Garth Nix", "Fantasy");
        book3 = new Book("Harry Potter", "J.K Rowling", "Fantasy");
        books = new ArrayList<>();
        books.add(book2);
        books.add(book3);
        library = new Library("Andersonian", 50, books);
        fuel = new ArrayList<>();
        fuel.add(book);
        fire = new Fire(fuel);
    }

    @Test
    public void startsWithABook() {
        assertEquals(fuel, fire.getFuel());
    }

    @Test
    public void canSpread() {
        fire.spread(library);
        assertEquals(2, fire.getSize());
        assertEquals(1, library.bookCount());
        fire.spread(library);
        assertEquals(3, fire.getSize());
        assertEquals(0, library.bookCount());
    }
}
