package models;

import interfaces.DiscountStrategy;

public class StudentDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.5;
    }
}
