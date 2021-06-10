package com.kaveridev.productapplication.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TABLE")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private double price;
    private String description;
    private String brand;
}
