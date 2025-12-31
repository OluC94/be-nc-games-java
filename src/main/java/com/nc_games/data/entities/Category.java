package com.nc_games.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "categories")
@Data
public class Category {
    
    @Id
    private Long id;

    private CategorySlug slug;

    private String description;
}
