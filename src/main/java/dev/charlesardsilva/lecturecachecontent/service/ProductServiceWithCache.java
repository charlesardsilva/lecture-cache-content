package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import org.springframework.stereotype.Service;

@Service
class ProductServiceWithCache implements ProductService{

    private final ProductServiceNoCache productServiceNoCache;

    public ProductServiceWithCache(ProductServiceNoCache productServiceNoCache) {
        this.productServiceNoCache = productServiceNoCache;
    }

    public Product byUcode(String ucode) {
        return productServiceNoCache.byUcode(ucode);
    }
}
