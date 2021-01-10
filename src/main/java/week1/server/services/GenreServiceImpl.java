package week1.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import week1.server.model.Genre;
import week1.server.repositories.GenreRepository;

public class GenreServiceImpl implements GenreService {

    @Autowired
    GenreRepository genreRepository;

    @Override
    public Iterable<Genre> findAll() {
        return genreRepository.findAll();
    }
}
