package Authentication;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {
    private List<User> users;

    public UserDatabase(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }
    public User getUserByUsername(String username){
        for(User user : users){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }
}
