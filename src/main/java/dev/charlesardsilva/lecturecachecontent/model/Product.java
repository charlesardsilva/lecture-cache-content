package dev.charlesardsilva.lecturecachecontent.model;

public record Product(String ucode,
                                long id,
                                String copy,
                                String photo,
                                String slug,
                                int students,
                                boolean active) {

    public Product(String ucode, long productId, boolean active) {
        this(ucode, productId, null, null, null, 0, active);
    }
}
