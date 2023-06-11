package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import org.springframework.stereotype.Service;

@Service
public class ProductPageService {

    private static final String CHECKOUT_CONFIG = "showOtherProducts";

    private final ProductService productService;
    private final ConfigService configService;
    private final StudentService studentService;
    private final PlatformService platformService;

    public ProductPageService(ProductService productService, ConfigService configService,
                              StudentService studentService, PlatformService platformService) {
        this.productService = productService;
        this.configService = configService;
        this.studentService = studentService;
        this.platformService = platformService;
    }

    public PageResponse getPage(String ucode) {
        var product = productService.byUcode(ucode);
        var config = configService.byKey(CHECKOUT_CONFIG);
        var amountOfStudents = studentService.amountOfStudents(product.id());
        var active = platformService.status(product.id());


        return null;

    }
}