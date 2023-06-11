package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.controller.dto.PageResponse;


public interface ProductPageService {

    PageResponse getPage(String ucode);
}
