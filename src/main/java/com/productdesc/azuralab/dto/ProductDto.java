package com.productdesc.azuralab.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class ProductDto {
    private Long id;
    private String title;
    private String description;
    private Double price;
    private Boolean isPublished;
}
