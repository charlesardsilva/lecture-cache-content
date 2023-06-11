package dev.charlesardsilva.lecturecachecontent.controller;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import dev.charlesardsilva.lecturecachecontent.service.ProductPageService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/page/products")
public class ProductPageController {

    private final ProductPageService productPageService;

    public ProductPageController(@Qualifier("productPageServiceNoCache") ProductPageService productPageService) {
        this.productPageService = productPageService;
    }
    @GetMapping("/{ucode}")
    public PageResponse getByUcode(@PathVariable("ucode") String ucode) {
      return productPageService.getPage(ucode);
    }
}