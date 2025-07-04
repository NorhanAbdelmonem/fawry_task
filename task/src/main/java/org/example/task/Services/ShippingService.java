package org.example.task.Services;

import org.example.task.cart.CartItem;
import org.example.task.product.Product;

import java.util.List;

public class ShippingService {
     public static void shipping(List<CartItem> items)
     {
         System.out.println("** Shipment notice **");

         double totalWeight = 0;
         for (CartItem item : items) {
             Product product = item.getProduct();
             int quantity = item.getQuantity();
             int weight = product.getWeight();
            totalWeight +=( weight*quantity);

            System.out.println(quantity +"x"+" "+ product.getName() + "\t" +  "\t "
                    +(weight *quantity)+ "g");
     }
         System.out.println("Total package weight: " +( totalWeight/1000.00 )+"kg");


     }}
