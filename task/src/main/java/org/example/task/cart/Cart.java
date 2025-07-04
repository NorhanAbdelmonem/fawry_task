package org.example.task.cart;

import org.example.task.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {


        private List<CartItem> items = new ArrayList<>();

        public void add(Product product, int quantity) {
            if (quantity > product.getQuantity()) {
                throw new IllegalArgumentException("The quantity is not enough");
            }

            items.add(new CartItem(product, quantity));
        }

        public List<CartItem> getItems() {
            return  items;

        }

        public boolean isEmpty() {

            return   items.isEmpty();

        }

        public double calculateSubtotal() {
            double subtotal = 0;

            for (CartItem item : items) {
                subtotal += item.getTotalPrice();
            }

            return  subtotal;

        }
    }


