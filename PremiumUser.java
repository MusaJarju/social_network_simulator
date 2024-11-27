package projects.simplified_social_network_simulation;
import java.util.ArrayList;

public class PremiumUser extends StandardUser {
    private ArrayList<Group> groups;

    public PremiumUser(String username, String email) {
        super(username, email);
        groups = new ArrayList<>();
    }

    public void createGroup(String groupName) {
        Group group = new Group(groupName, this);
        groups.add(group);
        System.out.println("Group " + groupName + " created by " + username);
    }

    public void sendPrivateMessage(UserProfile receiver, String content) {
        Message message = new Message(content, this, receiver);
        System.out.println("Message sent from " + username + " to " + receiver.username);
    }
}

