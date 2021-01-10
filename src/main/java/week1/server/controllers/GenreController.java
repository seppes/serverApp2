package week1.server.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import week1.server.model.Genre;
import week1.server.services.GenreService;

@RestController
@Slf4j
public class GenreController {
    @Autowired
    GenreService genreService;

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @CrossOrigin
    @GetMapping("/genres")
    public Iterable<Genre> findAll() {
        logger.info("#### findAll - genres");
        return genreService.findAll();
    }
}
