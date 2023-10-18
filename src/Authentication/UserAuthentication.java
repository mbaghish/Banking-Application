package Authentication;

public class UserAuthentication {
    private UserDatabase userDatabase;

    public UserAuthentication(){
        userDatabase = new UserDatabase();
    }

    public void registerUser(String username, String password){
        User user = new User(username, password);
        userDatabase.addUser(user);
    }
    public boolean authenticateUser(String username, String password){
        User user = userDatabase.getUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

}
