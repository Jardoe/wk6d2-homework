import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestLibrary {
    ArrayList<Book> collection;
    Library library;
    Book book2;
    Book book1;
    Book book3;
    HashMap<Genre, Integer> genreList;

    @Before
    public void before() {
        collection = new ArrayList<>();
        library = new Library(2);
        book1 = new Book("A",Genre.THRILLER);
        book2 = new Book("B", Genre.YA);
        book3 = new Book("C", Genre.YA);
        genreList = new HashMap<>();
    }

    @Test
    public void collectionStartsEmpty() {
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddToCollection() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddMoreThanCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.bookCount());

    }

    @Test
    public void canRemoveBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        library.removeBook();
        assertEquals(0, library.bookCount());

    }

    @Test
    public void genreListHasValues() {
        library.addBook(book1);
        library.addBook(book2);
        genreList.put(Genre.THRILLER, 1);
        genreList.put(Genre.YA, 1);
        assertEquals(, library.listCount());

    }


}