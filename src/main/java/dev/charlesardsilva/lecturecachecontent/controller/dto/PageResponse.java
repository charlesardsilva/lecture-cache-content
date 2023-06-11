package dev.charlesardsilva.lecturecachecontent.controller.dto;

public record PageResponse(String ucode,
                           long productId,
                           String copy,
                           String photo,
                           String slug,
                           int students,
                           boolean active) {
}
