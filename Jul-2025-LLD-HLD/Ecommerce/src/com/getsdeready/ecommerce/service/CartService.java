package com.getsdeready.ecommerce.service;

import com.getsdeready.ecommerce.model.Cart;
import com.getsdeready.ecommerce.model.CartProduct;
import com.getsdeready.ecommerce.model.Product;
import com.getsdeready.ecommerce.model.User;

public class CartService {

    public void addItemToCart(Product product, User user) {
        Cart cart = user.getCart();

        if (product.getInventoryStock() > 0) {
            // lock the product
            synchronized (product) {
                CartProduct cartProduct = new CartProduct();
                cartProduct.setProduct(product);
                cartProduct.setQuantity(1);
                cart.getCartProducts().add(cartProduct);
            }
        }

        // save cart
    }
}
