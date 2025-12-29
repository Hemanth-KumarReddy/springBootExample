package com.ecom.website.DTO;

import com.ecom.website.Entity.Categories;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ProductsDTO {

    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;
    private Categories category;
}
