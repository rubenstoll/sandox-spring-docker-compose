package ch.toto.sandobox.sandoxspringdockercompose;

import ch.toto.sandobox.sandoxspringdockercompose.entities.Post;
import ch.toto.sandobox.sandoxspringdockercompose.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * <a href="https://www.danvega.dev/blog/spring-boot-docker-compose">New in Spring Boot 3.1 - Spring Boot Docker Compose Module</a>
 */
@SpringBootApplication
public class SandoxSpringDockerComposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SandoxSpringDockerComposeApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PostRepository postRepository) {
        return args -> {
            postRepository.save(new Post("Hello World", "my first post"));
        };
    }
}
