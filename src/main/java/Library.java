import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;
    private HashMap<String, Integer> genreCounter;

    public Library(String name, int capacity, ArrayList<Book> books) {
        this.name = name;
        this.capacity = capacity;
        this.books = books;
        this.genreCounter = new HashMap<>();

        for (Book book : this.books){
            String genre = book.getGenre();
            if (genreCounter.get(genre) == null){
                genreCounter.put(genre, countGenre(genre));
            }
        }
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if (checkStock()) {
            this.books.add(book);
        }
    }

    public boolean checkStock() {
        return (this.capacity > bookCount());
    }

    public Book removeBook() {
        return this.books.remove(0);
    }

    public int countGenre(String genre) {
        int counter = 0;
        for (Book book : this.books) {
            if (book.getGenre() == genre) {
                counter += 1;
            }
        }
        return counter;
    }

    public HashMap getGenreCounter() {
        return this.genreCounter;
    }
}
