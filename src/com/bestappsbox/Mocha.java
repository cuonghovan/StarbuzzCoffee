package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Mocha extends CondimentDecorator{

    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.4;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
