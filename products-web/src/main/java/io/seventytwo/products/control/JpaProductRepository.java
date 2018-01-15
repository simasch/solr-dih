package io.seventytwo.products.control;

import io.seventytwo.products.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JpaProductRepository extends JpaRepository<ProductEntity, Integer> {

    List<ProductEntity> findByDescriptionStartingWith(String description);
}
