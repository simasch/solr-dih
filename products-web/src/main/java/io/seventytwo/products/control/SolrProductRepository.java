package io.seventytwo.products.control;

import io.seventytwo.products.document.Product;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface SolrProductRepository extends SolrCrudRepository<Product, Integer> {

    List<Product> findByDescriptionStartingWith(String description);
}
