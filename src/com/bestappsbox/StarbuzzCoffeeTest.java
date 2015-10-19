package com.bestappsbox;

public class StarbuzzCoffeeTest {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());
        Beverage milk = new Milk(darkRoast);
        Beverage whip = new Whip(milk);
        System.out.println(whip.getDescription() + " " + whip.cost());
        Beverage soy = new Soy (whip);
        System.out.println(soy.getDescription() + " " + soy.cost());
    }
}
