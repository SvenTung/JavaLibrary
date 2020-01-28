import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Book book2;
    private Book book3;
    private ArrayList<Book> books;


    @Before
    public void before(){
        books = new ArrayList<>();
        book = new Book("Blaze", "Stephen King", "Crime");
        book2 = new Book("The Fall", "Garth Nix", "Fantasy");
        book3 = new Book("Harry Potter", "J.K Rowling", "Fantasy");
        books.add(book);
        books.add(book2);
        books.add(book3);

        library = new Library("Andersonian", 50, books);
    }

    @Test
    public void hasName(){
        assertEquals("Andersonian", library.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, library.getCapacity());
    }

    @Test
    public void canGetStockOfBooks(){
        assertEquals(3, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(4, library.bookCount());
    }

    @Test
    public void cannotAddBook() {
        Library library2 = new Library("Mitchell", 3, books);
        library2.addBook(book);
        assertEquals(3, library2.bookCount());
    }

    @Test
    public void canRemoveBook() {
        assertEquals(book, library.removeBook());
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canGenreCount() {
        assertEquals(2, library.countGenre("Fantasy"));
    }

    @Test
    public void canGetGenreCounter() {
        assertEquals("{Crime=1, Fantasy=2}", library.getGenreCounter().toString());
    }
}
