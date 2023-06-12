package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;


public class ProductPageServiceImpl {

    private static final String CHECKOUT_CONFIG = "showOtherProducts";

    private final ProductService productService;
    private final ConfigService configService;
    private final StudentService studentService;
    private final PlatformService platformService;

    public ProductPageServiceImpl(ProductService productService, ConfigService configService,
                                     StudentService studentService, PlatformService platformService) {
        this.productService = productService;
        this.configService = configService;
        this.studentService = studentService;
        this.platformService = platformService;
    }

    public PageResponse getPage(String ucode) {
        // Ignore the possibility of having parallelism.

        var product = productService.byUcode(ucode); // Database
        var config = configService.byKey(CHECKOUT_CONFIG); // Database
        var amountOfStudents = studentService.amountOfStudents(product.id()); // Gateway
        var active = platformService.status(product.id()); // Gateway

        ...

        return null;

    }
}
