package service;

import model.Apple;
import model.Food;

import static model.constants.Colour.RED_APPLE;

public class ShoppingCart {

    Food[] cart;

    //конструктор для добавления элеменов в массив
    public ShoppingCart(Food[] cart) {
        this.cart = cart;
    }

    //метод получает общую сумму товаров в корзине без скидки
    public void totalAmount(Food[] cart) {
        double totalPrice = 0;
        for (int i = 0; i < cart.length; i++) {
            totalPrice = totalPrice + cart[i].getAmount() * cart[i].getPrice();
        }
        System.out.println("Сумма товаров в корзине без скидки: " + totalPrice);
    }

    //метод получает общую сумму товаров со скидкой
    public void totalAmountWithDiscount(Food[] cart) {
        double totalPrice = 0;
        for (int i = 0; i < cart.length; i++) {
            //проверяем, является ли текущий объект экземпляром класса Apple
            if (cart[i] instanceof Apple) {
                //приводим тип
                Apple apple = (Apple) cart[i];
                if (apple.getColour() == RED_APPLE) {
                    totalPrice = totalPrice + apple.getAmount() * apple.getDiscount();
                }
                else {
                    totalPrice = totalPrice + apple.getAmount() * apple.getPrice();
                }
            }
            else {
                totalPrice = totalPrice + cart[i].getAmount() * cart[i].getPrice();
            }
        }
        System.out.println("Общая сумма товаров в корзине со скидкой: " + totalPrice);

    }

    //метод получает общую сумму всех вегетарианских продуктов без скидки
    public void amountVegProductsWithoutDiscount(Food[] cart) {
        double totalPrice = 0;
        for (int i = 0; i < cart.length; i++) {
            if(cart[i].isVegetarian()) {
                totalPrice = totalPrice + cart[i].getAmount() * cart[i].getPrice();
            }
        }
        System.out.println("Сумма всех вегетарианских товаров в корзине без скидки: " + totalPrice);
    }

}
