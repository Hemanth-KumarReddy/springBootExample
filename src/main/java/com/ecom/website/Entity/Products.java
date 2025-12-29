package com.ecom.website.Entity;

import jakarta.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String imageUrl;
    private Double price;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    private Categories category;
}
