package sec9;

import java.util.Locale;
import java.util.Scanner;

public class sec9Construtores {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
       
        sec9_Product sec9_product = new sec9_Product(name,price, quantity);

        sec9_product.setName("Computador");
        System.out.println("Digitado = " + sec9_product.getName());


        System.out.println();
        
        System.out.println("Product data: " + sec9_product);

         System.out.println();
        
        System.out.print("Enter the number of products to be added in stock: ");
         quantity = sc.nextInt();
       
        sec9_product.addProducts(quantity);
        System.out.println();
      
        System.out.println("Updated data: " + sec9_product);
       
        System.out.println();
       
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
       
        sec9_product.removeProducts(quantity);
        System.out.println();
       
        System.out.println("Updated data: " + sec9_product);
        
        sc.close();
    }
}
