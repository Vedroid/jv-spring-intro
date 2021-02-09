package ua.vedroid.spring.service;

import java.util.List;
import ua.vedroid.spring.model.User;

public interface UserService {
    void add(User user);

    List<User> listUsers();
}
