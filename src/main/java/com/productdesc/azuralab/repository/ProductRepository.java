package com.productdesc.azuralab.repository;

import com.productdesc.azuralab.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitleContaining(String title);
    List<Product> findByPublished(Boolean isPublished);
}
