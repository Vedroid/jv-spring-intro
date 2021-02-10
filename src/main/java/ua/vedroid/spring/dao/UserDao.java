package ua.vedroid.spring.dao;

import java.util.List;
import java.util.Optional;
import ua.vedroid.spring.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long userId);

    List<User> listUsers();
}
