package dev.charlesardsilva.lecturecachecontent.controller;

import dev.charlesardsilva.lecturecachecontent.controller.dto.ProductResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/products")
public class ProductController {

    @GetMapping("/{ucode}")
    public ProductResponse getByUcode(@PathVariable("ucode") String ucode) {
        return null;
    }
}
