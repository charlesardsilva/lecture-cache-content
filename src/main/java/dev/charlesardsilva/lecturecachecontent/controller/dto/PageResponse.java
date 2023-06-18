package dev.charlesardsilva.lecturecachecontent.controller.dto;

public record PageResponse(String ucode,
                           String copy,
                           String photo,
                           String slug,
                           int students,
                           boolean active) {
}
