package DecoratorPattern;

import DecoratorPattern.Decorator.ExtraCheese;
import DecoratorPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Pizza cost for extra toppings " + pizza.cost());
    }
}
