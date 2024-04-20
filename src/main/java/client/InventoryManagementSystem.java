package client;


import dto.ProductRequest;
import entity.Product;
import service.ProductService;
import service.ProductServiceImpl;

import java.util.Scanner;

public class InventoryManagementSystem  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Shrkuaj emrin e produktit: ");
        String name = scanner.next();

        System.out.print("Pershkrimi: ");
        String description = scanner.next();


        System.out.print("Cmimi: ");
        double price = scanner.nextDouble();

        System.out.print("Sasia: ");
        int quantity = scanner.nextInt();

        ProductRequest request = new ProductRequest();
        request.setName(name);
        request.setDescription(description);
        request.setPrice(price);
        request.setQuantity(quantity);

        ProductService service = new ProductServiceImpl();
        service.create(request);


    }
}