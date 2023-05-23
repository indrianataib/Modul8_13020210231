
package Service;
import java.util.List;
import Model.Book;

public interface BookService {

    public void addBook(Book book);
    
    public List<Book> findBookList();
    
    public Book findBookById(int id);

    public void updateBook(Book book);

    public void removeBook(int id);

    
        
    }



