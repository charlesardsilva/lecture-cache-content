package dev.charlesardsilva.lecturecachecontent.service;

import dev.charlesardsilva.lecturecachecontent.model.Product;

public interface ProductService {

    Product byUcode(String id);
}
