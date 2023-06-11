package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductPageServiceWithCache implements ProductPageService {

    private final ProductPageServiceNoCache productPageServiceNoCache;

    public ProductPageServiceWithCache(ProductPageServiceNoCache productPageServiceNoCache) {
        this.productPageServiceNoCache = productPageServiceNoCache;
    }

    public PageResponse getPage(String ucode) {
        return productPageServiceNoCache.getPage(ucode);

    }
}
