package guru.springframework.spring6webapp.respositories;

import guru.springframework.spring6webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * sfg course work.
 */
public interface AuthorRespository extends CrudRepository<Author, Long> {
}
