import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Alma", "Tattuu",15, LocalDate.of(2023,2,11),TypeProduct.VEGETABLE);
        Product product2 = new Product("Kurma", "Tattuu",20, LocalDate.of(2023,2,14),TypeProduct.VEGETABLE);
        Product product3 = new Product("TV", "FullHD",1500, LocalDate.of(2022,2,16),TypeProduct.ELECTRONIC);
        Product product4 = new Product("Camera", "Digital",1800, LocalDate.of(2022,2,12),TypeProduct.ELECTRONIC);
        Product product5 = new Product("Notebook", "FullHD and Digital",2000, LocalDate.of(2022,8,16),TypeProduct.ELECTRONIC);
        Product product6 = new Product("Jacket", "Fashionable",700, LocalDate.of(2022,12,1),TypeProduct.CLOTHES);
        Product product7 = new Product("T-Shirt", "Convinent",1500, LocalDate.of(2022,4,16),TypeProduct.CLOTHES);

        Product[] producs = {product1,product2};
        Product[] producs1 = {product3,product4,product5,product6,product7};
        for (Product a:producs) {
        }
        inventory inventory1 = new inventory(producs);
        inventory1.expirationDate();
        System.out.println();
        System.out.println(inventory1);
        System.out.println();
        System.out.println( inventory1.search("Alma"));
        System.out.println();
        inventory inventory2 = new inventory(producs1);
        inventory2.discount();
        System.out.println(inventory2);
        System.out.println();
         System.out.println( inventory2.search("Camera"));
        System.out.println();
         System.out.println(inventory2.searchbyType("CLOTHES"));
    }
}