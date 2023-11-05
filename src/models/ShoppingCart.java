package models;

import interfaces.DiscountStrategy;

public class ShoppingCart {
        private DiscountStrategy discountStrategy;

        public void setDiscountStrategy(DiscountStrategy discountStrategy) {
            this.discountStrategy = discountStrategy;
        }

        public double calcularDesconto(double price) {
            return discountStrategy.applyDiscount(price);
        }
}
