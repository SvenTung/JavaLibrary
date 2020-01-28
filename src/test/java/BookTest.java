import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("The Fall", "Garth Nix", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("The Fall", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Garth Nix", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }
}
