import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<Genre, Integer> genreList;

    public Library(int capacity) {
        this.capacity = capacity;
        collection = new ArrayList<>();
        genreList = new HashMap<>();
    }

    public int bookCount(){
        return collection.size();
    }

    public void addBook(Book book){
        if(bookCount() < capacity){
            collection.add(book);
        }
    }

    public Book removeBook() {
        return this.collection.remove(0);
    }

    public long listCount() {
        return genreList.();
    }
}
