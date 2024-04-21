package converter;

import dto.ProductRequest;
import entity.Category;
import entity.Product;

public class ProductConverter {
    public static Product convertToEntity(ProductRequest request){
        Product product = new Product();
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        product.setDescription(request.getDescription());
        product.setName(request.getName());
        product.setCategory(new Category(request.getCategoryId()));

        return product;
    }
}
