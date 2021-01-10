package week1.server.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.server.ResponseStatusException;
import week1.server.model.Book;
import week1.server.repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.Thread.sleep;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @CrossOrigin
    @GetMapping("/books")
    @ApiOperation(value = "test")
    public Iterable<Book> findAll(@RequestParam(required = false) String titleKeyWord) {
        logger.info("#### findAll - titlKeyWords= " + titleKeyWord);
        if (titleKeyWord != null) {
            return bookRepository.findByTitleContainsIgnoreCase(titleKeyWord);
        } else {
            return bookRepository.findAll();
        }
    }

    @CrossOrigin
    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/books")
    public Book create(@Valid  @RequestBody Book book) {
        logger.info("##### create");
        Optional<Book> bookFromDb = bookRepository.findByTitle(book.getTitle());
        if (bookFromDb.isPresent()){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
            String.format("book with title %s already exists", book.getTitle()));
        }
        return bookRepository.save(book);
    }

    @CrossOrigin
    @PutMapping("/books/{id}")
    public Book edit(@PathVariable int id, @RequestBody Book book) {
        logger.info("##### edit");
        if (book.getId()!=id) return null;
        Optional<Book> bookFromDb = bookRepository.findById(id);
        if (bookFromDb.isPresent()) {
            return bookRepository.save(book);
        }
        return null;
    }

    @CrossOrigin
    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable int id) {
        logger.info("##### delete");
        bookRepository.deleteById(id);
    }
}