package com.nc_games.data.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "reviews")
@Data
public class Review {
    @Id
    private Long id;

    private String title;

    private CategorySlug category;
    
    private String designer;

    private String owner;

    private String body;

    private String imgUrl;

    private Long createdAt;

    private Integer votes;

}
