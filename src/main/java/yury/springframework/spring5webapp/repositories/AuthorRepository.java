package yury.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import yury.springframework.spring5webapp.model.Author;

/**
 * Created by ysedn on Mar 04, 2018
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {



}
