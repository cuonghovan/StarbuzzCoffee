package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        description = "Milk";
        cost = 0.3;
        this.beverage = beverage;
    }
}
