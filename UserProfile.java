package projects.simplified_social_network_simulation;

import java.util.ArrayList;

public abstract class UserProfile {
    protected String username;
    protected String email;
    protected ArrayList<UserProfile> friends;

    public UserProfile(String username, String email) {
        this.username = username;
        this.email = email;
        this.friends = new ArrayList<>();
    }

    public void addFriend(UserProfile friend) {
        if (!friends.contains(friend)) {
            friends.add(friend);
            System.out.println(friend.username + " is been added as a friend.");
        } else {
            System.out.println(friend.username + "   already a friend.");
        }
    }

    public void removeFriend(UserProfile friend) {
        if (friends.remove(friend)) {
            System.out.println(friend.username + " removed from friends list.");
        } else {
            System.out.println(friend.username + " not found in friends list.");
        }
    }

    public void viewFriends() {
        System.out.println(username + "'s Friends:");
        for (UserProfile friend : friends) {
            System.out.println(friend.username);
        }
    }

    public abstract void createPost(Post post);
    public abstract void viewTimeline();

    public UserProfile searchFriend(String username) {
        for (UserProfile friend : friends) {
            if (friend.username.equals(username)) {
                return friend;
            }
        }
        return null;
    }


}
