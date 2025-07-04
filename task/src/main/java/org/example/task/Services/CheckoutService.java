package org.example.task.Services;
import org.example.task.cart.Cart;
import org.example.task.cart.CartItem;
import org.example.task.customer.Customer;
import org.example.task.product.Product;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
               if (cart.isEmpty())
               {
                   throw new IllegalStateException("Cart is empty");
             }

        for (CartItem item : cart.getItems())
        {
            Product product = item.getProduct();

            if (product.isExpirable() && product.isExpired()) {
                throw new IllegalStateException(product.getName() + " is expired");
            }

            if (item.getQuantity() > product.getQuantity()) {

                throw new IllegalStateException("No enough quantity for " + product.getName());
            }
        }

        double subtotal = cart.calculateSubtotal();
        double shipping = 0;
        List<CartItem> shippableItems = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            if (item.getProduct().isShippable()) {
                shippableItems.add(item);
                shipping += (item.getProduct().getWeight()/1000.00) * item.getQuantity() * 10 ;
                // 10 EGP for every  kg
            }
        }

        double total = subtotal + shipping;
        if (total > customer.getBalance()) {
            System.out.println(total + "          " + customer.getBalance());
            throw new IllegalStateException("Your balance is Not enough");
        }

        for (CartItem item : cart.getItems()) {
            item.getProduct().decreaseQuantity(item.getQuantity());
        }

        customer.decreaseBalance(total);

        if (!shippableItems.isEmpty()) {
            ShippingService.shipping(shippableItems);
        }

        System.out.println("** Checkout receipt **");
        for (CartItem item : cart.getItems()) {
            System.out.println(item.getQuantity() + "x " + item.getProduct().getName()
                    + " " + item.getTotalPrice());
        }
         System.out.println("----------------------");

        System.out.println("Subtotal " + subtotal);

        System.out.println("Shipping " + shipping);

        System.out.println("Amount " + total);

        System.out.println("Remaining balance: " + customer.getBalance());
    }
}
