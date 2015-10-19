package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        description = "Mocha";
        cost = 0.4;
        this.beverage = beverage;
    }
}
