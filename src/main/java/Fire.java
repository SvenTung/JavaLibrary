import java.util.ArrayList;

public class Fire {

    private ArrayList<Book> fuel;

    public Fire(ArrayList<Book> fuel) {
        this.fuel = fuel;
    }

    public ArrayList<Book> getFuel() {
        return fuel;
    }

    public int getSize() {
        return fuel.size();
    }

    public void spread(Library library) {
        Book nextBook = library.removeBook();
        fuel.add(nextBook);
    }
}
