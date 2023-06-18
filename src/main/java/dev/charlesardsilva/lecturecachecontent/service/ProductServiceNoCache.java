package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import dev.charlesardsilva.lecturecachecontent.repository.ProductRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
class ProductServiceNoCache implements ProductService{

    private final ProductRepository productRepository;

    public ProductServiceNoCache(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product byUcode(String id) {
        return productRepository.findByUcode(id);
    }
}
