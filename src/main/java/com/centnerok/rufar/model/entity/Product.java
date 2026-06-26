package com.centnerok.rufar.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id", nullable=false)
    private User userId;

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="photo_path")
    private String photoPath;

    @Column(name="price")
    private Long price;

    @Column(name="city", nullable=false)
    private String city;
}
