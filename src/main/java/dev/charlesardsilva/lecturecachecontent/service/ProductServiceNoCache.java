package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import dev.charlesardsilva.lecturecachecontent.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
class ProductServiceNoCache {

    private final ProductRepository productRepository;

    public ProductServiceNoCache(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product byUcode(String ucode) {
        return productRepository.findByUcode(ucode);
    }
}
