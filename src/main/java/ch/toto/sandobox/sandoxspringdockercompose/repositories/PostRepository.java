package ch.toto.sandobox.sandoxspringdockercompose.repositories;

import ch.toto.sandobox.sandoxspringdockercompose.entities.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository interface for managing Post entities.
 * <a href="https://www.geeksforgeeks.org/java/spring-boot-difference-between-crudrepository-and-jparepository/">Spring Boot - Difference Between CrudRepository and JpaRepository</a>
 */
public interface PostRepository extends CrudRepository<Post, Integer> {

}