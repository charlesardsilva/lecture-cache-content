package dev.charlesardsilva.lecturecachecontent.model;

public record Product(String id,
                                String copy,
                                String photo,
                                String slug,
                                boolean active) {

    public Product(String id, boolean active) {
        this(id, null, null, null, active);
    }
}
