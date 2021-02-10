package ua.vedroid.spring.service;

import org.springframework.stereotype.Component;
import ua.vedroid.spring.dto.UserResponseDto;
import ua.vedroid.spring.model.User;

@Component
public class UserMapper {
    public User getUser(UserResponseDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setEmail(dto.getEmail());
        user.setFirstName(dto.getFirstName());
        user.setLastName(dto.getLastName());
        return user;
    }

    public UserResponseDto getUserResponseDto(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        return dto;
    }
}
