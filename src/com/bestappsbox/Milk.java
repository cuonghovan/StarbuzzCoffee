package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Milk extends CondimentDecorator{
    private Beverage beverage;
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() +0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
