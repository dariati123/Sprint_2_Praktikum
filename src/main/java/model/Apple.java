package model;

import static model.constants.Discount.DISCOUNT;

public class Apple extends Food implements Discountable {
    private String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        double discountedPrise = price * (100 - DISCOUNT) / 100;
        return discountedPrise;
    }
}
