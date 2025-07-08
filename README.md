# E-Commerce System

## Overview
A simple e-commerce system that allows managing products, adding them to a cart, and checking out with payment and shipping calculations. It handles product expiration and stock availability.

## Features
- Products have name, price, quantity, expiration status, shipping requirement, and weight.
- Supports expirable products (like Cheese, Biscuits) and non-expirable (like TV, Scratch Card).
- Only shippable products provide weight and require shipping.
- Customers can add products to the cart with a quantity limit based on stock.
- Checkout validates the cart is not empty, checks stock and expiration, and verifies customer balance.
- Shipping service handles shippable items and prints shipping details.

## Classes
- `Product`: Represents a product.
- `CartItem`: An item in the cart with product and quantity.
- `Cart`: Holds multiple cart items.
- `Customer`: Represents a customer with balance.
- `ShippingService`: Handles shipping logic and printing shipment notice.
- `CheckoutService`: Processes checkout, payment, and stock update.
- `Main`: Demonstrates usage with example products.

## How to Run
1. Create a Java project.
2. Add all `.java` files.
3. Run `Main.java`.
4. Check console output for shipping and receipt details.

##  Screenshot
Here's a sample run of the bookstore system:
![Screenshot (557)](https://github.com/user-attachments/assets/5216db0d-3313-4b02-b695-5f63ebf31ebd)
