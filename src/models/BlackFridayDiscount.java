package models;

import interfaces.DiscountStrategy;

public class BlackFridayDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.2;
    }
}
