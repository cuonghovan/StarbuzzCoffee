package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class CondimentDecorator extends Beverage{
     protected Beverage beverage;

    @Override
    public double cost() {
        return cost + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + description;
    }

}
