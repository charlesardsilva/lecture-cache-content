package dev.charlesardsilva.lecturecachecontent.repository;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class ProductRepository {

    public Product findByUcode(String id) {
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Product(id, "Produto de teste", "https://x", "product-teste" ,true);
    }
}
