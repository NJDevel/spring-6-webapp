package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.respositories.AuthorRespository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRespository authorRespository;

    public AuthorServiceImpl(AuthorRespository authorRespository) {
        this.authorRespository = authorRespository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRespository.findAll();
    }
}
