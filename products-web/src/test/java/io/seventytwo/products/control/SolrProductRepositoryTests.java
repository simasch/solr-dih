package io.seventytwo.products.control;

import io.seventytwo.products.document.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SolrProductRepositoryTests {

    @Autowired
    private SolrProductRepository solrProductRepository;

    @Test
    public void findAllProductsWithSolr() {
        Iterable<Product> list = solrProductRepository.findAll();

        list.forEach(product -> System.out.println(product.getDescription()));
    }

}
