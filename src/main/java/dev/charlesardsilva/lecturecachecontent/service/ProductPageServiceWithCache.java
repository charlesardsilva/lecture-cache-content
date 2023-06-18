
package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class ProductPageServiceWithCache extends ProductPageServiceImpl implements ProductPageService {

    public ProductPageServiceWithCache(@Qualifier("productServiceWithCache") ProductService productService,
                                       @Qualifier("configServiceWithCache") ConfigService configService,
                                       @Qualifier("studentServiceWithCache") StudentService studentService,
                                       @Qualifier("reviewServiceWithCache") ReviewService reviewService) {
        super(productService, configService, studentService, reviewService);
    }

    @Cacheable
    public PageResponse getPage(String id) {
        return super.getPage(id);
    }
}
