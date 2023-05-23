
package Model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Book {
    private int id;
    private String author_name;
    private String title;
    
    public Book(String title, String authorName){
        this.title=title;
        this.author_name=authorName;
    }
    public Book(){
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
