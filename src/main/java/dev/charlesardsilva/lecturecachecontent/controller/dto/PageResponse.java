package dev.charlesardsilva.lecturecachecontent.controller.dto;

public record PageResponse(String id,
                           String copy,
                           String photo,
                           String slug,
                           int students,
                           double rating,
                           boolean checkoutEnabled) {

}
