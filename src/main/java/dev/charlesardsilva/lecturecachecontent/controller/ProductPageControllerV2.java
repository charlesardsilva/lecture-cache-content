package dev.charlesardsilva.lecturecachecontent.controller;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import dev.charlesardsilva.lecturecachecontent.service.ProductPageService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Product using cache")
@RestController
@RequestMapping("v2/page/products")
public class ProductPageControllerV2 {

    private final ProductPageService productPageService;

    public ProductPageControllerV2(@Qualifier("productPageServiceWithCache") ProductPageService productPageService) {
        this.productPageService = productPageService;
    }

    @Operation(summary = "Get a product page")
    @GetMapping("/{id}")
    public PageResponse getById(@PathVariable("id") String id) {
        return productPageService.getPage(id);
    }
}
