package io.seventytwo.products;

import io.seventytwo.products.control.JpaProductRepository;
import io.seventytwo.products.control.SolrProductRepository;
import io.seventytwo.products.document.Product;
import io.seventytwo.products.entity.ProductEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductsWebApplicationTests {

    @Autowired
    private SolrProductRepository solrProductRepository;
    @Autowired
    private JpaProductRepository jpaProductRepository;


    @Test
    public void findAllProductsWithSolr() {
        Iterable<Product> list = solrProductRepository.findAll();

        list.forEach(product -> System.out.println(product.getDescription()));
    }

    @Test
    public void findAllProductsWithJpa() {
        List<ProductEntity> list = jpaProductRepository.findAll();

        list.forEach(product -> System.out.println(product.getDescription()));
    }

}
