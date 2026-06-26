package com.centnerok.rufar.model.dto;

import com.centnerok.rufar.model.enums.Rating;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String description;
    private String photo_path;
    private Rating rating;
}
