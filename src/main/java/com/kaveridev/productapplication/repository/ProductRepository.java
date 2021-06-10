package com.kaveridev.productapplication.repository;

import com.kaveridev.productapplication.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
