package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
class ProductServiceWithCache implements ProductService{

    private final ProductServiceNoCache productServiceNoCache;

    public ProductServiceWithCache(ProductServiceNoCache productServiceNoCache) {
        this.productServiceNoCache = productServiceNoCache;
    }

    @Cacheable
    public Product byId(String id) {
        return productServiceNoCache.byId(id);
    }
}
