package io.seventytwo.products.boundry;

import io.seventytwo.products.control.JpaProductRepository;
import io.seventytwo.products.control.SolrProductRepository;
import io.seventytwo.products.document.Product;
import io.seventytwo.products.entity.ProductEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final JpaProductRepository jpaProductRepository;
    private final SolrProductRepository solrProductRepository;

    public ProductController(JpaProductRepository jpaProductRepository, SolrProductRepository solrProductRepository) {
        this.jpaProductRepository = jpaProductRepository;
        this.solrProductRepository = solrProductRepository;
    }

    @GetMapping("jpa")
    public List<ProductEntity> getProductsWithJpa() {
        return jpaProductRepository.findAll();
    }

    @GetMapping("solr")
    public Iterable<Product> getProductsWithSolr() {
        return solrProductRepository.findAll();
    }

}
