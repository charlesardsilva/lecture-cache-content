package dev.charlesardsilva.lecturecachecontent.model;

public record Product(String ucode,
                                long id,
                                String copy,
                                String photo,
                                String slug,
                                boolean active) {

    public Product(String ucode, long productId, boolean active) {
        this(ucode, productId, null, null, null, active);
    }
}
