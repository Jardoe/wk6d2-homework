import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCustomer {

    ArrayList<Book> customerCollection;
    Book book1;
    Customer customer;
    Library library;

    @Before
    public void before(){
        customerCollection = new ArrayList<>();
        book1 = new Book("A", Genre.THRILLER);
        customer = new Customer("Bob");
        library = new Library(2);
    }

    @Test
    public void customerCanAddBook(){
        customer.addBook(book1);
        assertEquals(1, customer.bookCount());

    }

    @Test
    public void customerCanRentBook() {
        library.addBook(book1);
        customer.rentBook(library);
        assertEquals(1, customer.bookCount());
        assertEquals(0, library.bookCount());
    }

}
