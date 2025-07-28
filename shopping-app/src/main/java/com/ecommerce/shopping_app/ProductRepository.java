package com.ecommerce.shopping_app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // Find products by name (case-insensitive)
    List<Product> findByNameContainingIgnoreCase(String keyword);
}
