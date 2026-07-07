import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;

public class Main {
    public static void main(String[] agrs) {

        Meat meat = new Meat(5, 100, false);
        Apple red_apple = new Apple(10, 50, true, RED_APPLE);
        Apple green_apple = new Apple(8, 60, true, GREEN_APPLE);

        //создаем массив с данными
        Food[] cart = {meat, red_apple, green_apple};
        //создается объект класса и передается массив в конструктор
        ShoppingCart shoppingCart = new ShoppingCart(cart);

        shoppingCart.totalAmount(cart);
        shoppingCart.totalAmountWithDiscount(cart);
        shoppingCart.amountVegProductsWithoutDiscount(cart);

    }
}
