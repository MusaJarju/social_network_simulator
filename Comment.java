package projects.simplified_social_network_simulation;
/*
The Comment class is used
to encapsulate user comments on posts.
 */
public class Comment {
    private String content;
    private UserProfile author;

    public Comment(String content, UserProfile author) {
        this.content = content;
        this.author = author;
    }
}

