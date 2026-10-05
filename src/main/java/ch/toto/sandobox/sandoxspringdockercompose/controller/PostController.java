package ch.toto.sandobox.sandoxspringdockercompose.controller;

import java.util.List;

import ch.toto.sandobox.sandoxspringdockercompose.entities.Post;
import ch.toto.sandobox.sandoxspringdockercompose.repositories.PostRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    public PostController(PostRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Post> findAll() {
        return (List<Post>) repository.findAll();
    }

}