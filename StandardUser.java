package projects.simplified_social_network_simulation;

import java.util.ArrayList;

public class StandardUser extends UserProfile implements Postable {
    private ArrayList<Post> timeline;

    public StandardUser(String username, String email) {
        super(username, email);
        this.timeline = new ArrayList<>();
    }

    @Override
    public void createPost(Post post) {
        timeline.add(post);
        System.out.println("Post created by " + username + ": " + post.content);
    }

    @Override
    public void viewTimeline() {
        System.out.println(username + "'s Timeline:");
        for (Post post : timeline) {
            post.displayPost();
        }
    }
}

