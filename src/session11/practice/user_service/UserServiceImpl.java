package session11.practice.user_service;

public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        //validare user
        //set special properties user.setCreatedAt(LocalDateTime.now())
        //save user to database
        //return user
        return null;
    }

    @Override
    public void deleteUser(long id) {
        //...
    }
}
