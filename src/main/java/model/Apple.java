package model;

import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.DISCOUNT;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)) {
            return amount * (price * (100 - DISCOUNT) / 100);
        }
        return 0;
    }
}
