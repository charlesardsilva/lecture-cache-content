
package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProductPageServiceNoCache extends ProductPageServiceImpl implements ProductPageService {

    public ProductPageServiceNoCache(ProductService productService, ConfigService configService,
                                     StudentService studentService, ReviewService reviewService) {
        super(productService, configService, studentService, reviewService);
    }

    public PageResponse getPage(String id) {
        return super.getPage(id);
    }
}
