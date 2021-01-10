package week1.server.model;



import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Entity
public class Book {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_generator")
    @SequenceGenerator(name = "book_generator", sequenceName = "book_seq", allocationSize = 1)
    @Id
    int id;
    @NotBlank(message = "title should not be blank") @NotNull
    String title;
    @NotBlank(message = "author should not be blank") @NotNull
    String author;
    @Positive(message = "price can not be 0 or below")
    int price;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() { return price; }

    public void setPrice(int price) { this.price = price; }
}

