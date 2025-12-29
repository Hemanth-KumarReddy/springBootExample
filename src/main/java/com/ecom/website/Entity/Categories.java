package com.ecom.website.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categories {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "category",
               cascade = CascadeType.ALL,
               fetch = FetchType.LAZY)
    private Set<Products> products;

    public Categories(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
