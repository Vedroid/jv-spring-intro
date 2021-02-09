package ua.vedroid.spring.dao;

import java.util.List;
import ua.vedroid.spring.model.User;

public interface UserDao {
    User add(User user);

    List<User> listUsers();
}
