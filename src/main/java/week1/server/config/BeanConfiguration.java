package week1.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import week1.server.services.GenreService;
import week1.server.services.GenreServiceImpl;

@Configuration
public class BeanConfiguration {
    @Bean
    GenreService getGenreService(){
        return new GenreServiceImpl();
    }
}
