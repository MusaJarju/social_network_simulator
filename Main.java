package projects.simplified_social_network_simulation;

public class Main {
    public static void main(String[] args) {
        StandardUser user1 = new StandardUser("Fathermusa", "me@jarju.com");
        PremiumUser user2 = new PremiumUser("Babucarr Drammeh", "drammeh@gmail.com");

        user1.addFriend(user2);
        user1.viewFriends();

        TextPost post1 = new TextPost("You're the best lecturer so far in UTG!", user1);
        user1.createPost(post1);
        user1.viewTimeline();

        user2.createGroup("Java Devs");
        user2.sendPrivateMessage(user1, "hello, welcome to the platform!");
    }
}

