package com.centnerok.rufar.mapper;

import com.centnerok.rufar.model.dto.UserDto;
import com.centnerok.rufar.model.entity.User;

public class UserMapper {
    public static UserDto mapToDto (User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setName(user.getName());
        userDto.setDescription(user.getDescription());
        userDto.setPhotoPath(user.getPhotoPath());
        userDto.setRating(user.getRating());

        return userDto;
    }

    public static User mapToProduct (UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setName(userDto.getName());
        user.setDescription(userDto.getDescription());
        user.setPhotoPath(userDto.getPhotoPath());
        user.setRating(userDto.getRating());

        return user;
    }
}
