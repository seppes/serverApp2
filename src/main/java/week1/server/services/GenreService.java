package week1.server.services;

import org.springframework.stereotype.Service;
import week1.server.model.Genre;

@Service
public interface GenreService {
    Iterable<Genre> findAll();
}
