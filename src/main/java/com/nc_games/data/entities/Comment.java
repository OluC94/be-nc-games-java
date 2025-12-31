package com.nc_games.data.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "comments")
@Data
public class Comment {
    @Id
    private Long id;

    private String author;

    private Integer votes;

    private Long createAt;

}
