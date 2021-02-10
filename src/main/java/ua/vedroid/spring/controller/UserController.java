package ua.vedroid.spring.controller;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.vedroid.spring.dto.UserResponseDto;
import ua.vedroid.spring.model.User;
import ua.vedroid.spring.service.UserMapper;
import ua.vedroid.spring.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/inject")
    public boolean injectData() {
        userService.add(new User("Alice", "Alison", "Alice@mail.com"));
        userService.add(new User("Bob", "Bobson", "Bob@mail.com"));
        userService.add(new User("Bruce", "Willis", "Bruce@mail.com"));
        userService.add(new User("John", "Wick", "John@mail.com"));
        return true;
    }

    @GetMapping("/{userId}")
    public UserResponseDto get(@PathVariable Long userId) {
        return userMapper.getUserResponseDto(userService.get(userId));
    }

    @GetMapping
    public List<UserResponseDto> getAll() {
        return userService.listUsers().stream()
                .map(userMapper::getUserResponseDto)
                .collect(Collectors.toList());
    }
}
