package ua.vedroid.spring.service;

import java.util.List;
import ua.vedroid.spring.model.User;

public interface UserService {
    void add(User user);

    User get(Long userId);

    List<User> listUsers();
}
