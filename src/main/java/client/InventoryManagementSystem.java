package client;
import dto.ProductRequest;
import service.ProductService;
import service.ProductServiceImpl;
import java.util.Scanner;
public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inventory Managment System");
        System.out.println("1. Add product");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                createProduct(sc);
                break;
            case 2:
                break;
        }
    }
    public static void createProduct(Scanner scanner) {
        ProductRequest productRequest = new ProductRequest();
        System.out.println("Ju lutem fusni emrin e producktit");
        productRequest.setName(scanner.next());
        System.out.println("Ju lutem fusni pershkrimin e produktit");
        productRequest.setDescription(scanner.next());
        System.out.println("Ju lutem fusni ID e categorise");
        productRequest.setCategoryId(scanner.nextLong());
        System.out.println("Ju lutem fusni cmimin e produktit");
        productRequest.setPrice(scanner.nextDouble());
        System.out.println("Ju lutem fusni sasine e produktit");
        productRequest.setQuantity(scanner.nextInt());
        ProductService productService = new ProductServiceImpl();
        productService.create(productRequest);
    }
}







