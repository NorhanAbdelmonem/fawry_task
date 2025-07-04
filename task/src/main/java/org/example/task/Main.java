package org.example.task;

import org.example.task.cart.Cart;
import org.example.task.customer.Customer;
import org.example.task.Services.CheckoutService;
import org.example.task.product.Product;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create sample products
        Product cheese = new Product("Cheese", 100,
                5, true, LocalDate.now().plusDays(5), true, 200);

        Product biscuits = new Product("Biscuits", 150, 10,
                true, LocalDate.now().plusDays(5), false, 700);

       Product tv = new Product("TV", 300, 6,
      false, LocalDate.now().plusDays(5), true, 1000);

        Product scratchCard = new Product("Scratch Card", 50, 10,
                false, null, false, 100);


        Customer customer = new Customer("Norhan", 5000);


        Cart cart = new Cart();
        cart.add(cheese, 2);
        cart.add(biscuits, 1);
       cart.add(tv, 1);
        cart.add(scratchCard, 1);


        CheckoutService.checkout(customer, cart);
    }
}
