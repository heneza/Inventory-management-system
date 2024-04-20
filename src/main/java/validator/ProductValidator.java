package validator;

import dto.ProductRequest;

public class ProductValidator {
    public static void validateProduct(ProductRequest request) {
        if(request.getName().isBlank()) {
            throw new IllegalArgumentException(
                    "Ju lutem emri i produktit " +
                            "eshte required"
            );
        }
    }
}
