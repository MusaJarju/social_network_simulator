package projects.simplified_social_network_simulation;

import java.util.ArrayList;
import java.util.Date;
/*
This class serves as a base for different
 post types, including text, image, and video posts.   */
public abstract class Post {
    protected String content;
    protected Date timestamp;
    protected UserProfile author;
    protected ArrayList<Comment> comments;
    protected int likes;

    public Post(String content, UserProfile author) {
        this.content = content;
        this.author = author;
        this.timestamp = new Date();
        this.comments = new ArrayList<>();
        this.likes = 0;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public void likePost() {
        likes++;
    }

    public void displayPost() {
        System.out.println("Post by " + author.username + ": " + content + " | Likes: " + likes + " | Comments: " + comments.size());
    }
}
