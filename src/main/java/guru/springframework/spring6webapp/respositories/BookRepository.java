package guru.springframework.spring6webapp.respositories;

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * sfg course work.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
