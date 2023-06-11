package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import dev.charlesardsilva.lecturecachecontent.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product byUcode(String ucode) {
        return productRepository.findByUcode(ucode);
    }

    public Product byUcodeWithCache(String ucode) {
        return byUcode(ucode);
    }
}
