package validator;

import dto.ProductRequest;

public class ProductValidator {
    public void validateProduct(ProductRequest request){
        if (request.getName().isBlank()) {
            throw new IllegalArgumentException (
                    "Ju lutem emri produktit eshte required");
        }
    }
}
