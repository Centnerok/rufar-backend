package com.centnerok.rufar.model.dto;

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
    private Long user_id;
    private String name;
    private String description;
    private String photo_path;
    private Long price;
    private String city;
}
