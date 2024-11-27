package projects.simplified_social_network_simulation;

import java.util.ArrayList;
/*
 Groups allow premium
 users to create and manage group posts and members. */
public class Group {
    private String groupName;
    private PremiumUser admin;
    private ArrayList<UserProfile> members;
    private ArrayList<Post> groupPosts;

    public Group(String groupName, PremiumUser admin) {
        this.groupName = groupName;
        this.admin = admin;
        this.members = new ArrayList<>();
        this.groupPosts = new ArrayList<>();
        addMember(admin);  // Admin is the first member
    }

    public void addMember(UserProfile user) {
        if (!members.contains(user)) {
            members.add(user);
            System.out.println(user.username + " added to group " + groupName);
        }
    }

    public void removeMember(UserProfile user) {
        if (members.remove(user)) {
            System.out.println(user.username + " removed from group " + groupName);
        }
    }

    public void postToGroup(Post post) {
        groupPosts.add(post);
        System.out.println("Post added to group " + groupName);
    }
}

