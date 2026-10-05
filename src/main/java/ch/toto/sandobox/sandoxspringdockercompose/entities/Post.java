package ch.toto.sandobox.sandoxspringdockercompose.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Created by ruben
 **/
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Integer id;

    private String title;

    private String body;

    // Constructors, getters, setters, and toString() methods go here
    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post() {

    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}

