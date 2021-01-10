package week1.server.repositories;

import week1.server.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface BookRepository extends CrudRepository<Book, Integer> {
    Iterable<Book> findByTitleContainsIgnoreCase(String titleKeyWord);
    Optional<Book> findByTitle(String title);
}