package com.centnerok.rufar.model.dto;

import com.centnerok.rufar.model.entity.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private User userId;
    private String name;
    private String description;
    private String photoPath;
    private Long price;
    private String city;
}
