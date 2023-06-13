package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;


public class ProductPageServiceImpl {

    private static final String CHECKOUT_CONFIG = "showOtherProducts";

    private final ProductService productService;
    private final ConfigService configService;
    private final StudentService studentService;
    private final ReviewService reviewService;

    public ProductPageServiceImpl(ProductService productService, ConfigService configService,
                                     StudentService studentService, ReviewService reviewService) {
        this.productService = productService;
        this.configService = configService;
        this.studentService = studentService;
        this.reviewService = reviewService;
    }

    public PageResponse getPage(String ucode) {
        // Ignore the possibility of having parallelism

        var product = productService.byUcode(ucode); // Database
        var amountOfStudents = studentService.amountOfStudents(product.id()); // External Service
        var rating = reviewService.rating(product.id());// External Service

        var config = configService.byKey(CHECKOUT_CONFIG); // Database

        // More code that can not be cached


        return null;

    }
}
