import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Book> customerCollection;

    public Customer(String name){
        this.name = name;
        customerCollection = new ArrayList<>();
    }

    public int bookCount(){
        return customerCollection.size();
    }

    public void addBook(Book book){
        customerCollection.add(book);
    }

    public void rentBook(Library library){
        if(library.bookCount() != 0){
            Book book = library.removeBook();
            addBook(book);
        }
    }
}
