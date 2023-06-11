package dev.charlesardsilva.lecturecachecontent.service2.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductPageServiceWithCache implements ProductPageService {

    private final ProductPageServiceNoCache productPageServiceNoCache;

    public ProductPageServiceWithCache(ProductPageServiceNoCache productPageServiceNoCache) {
        this.productPageServiceNoCache = productPageServiceNoCache;
    }

    @Cacheable
    public PageResponse getPage(String ucode) {
        return productPageServiceNoCache.getPage(ucode);

    }
}
