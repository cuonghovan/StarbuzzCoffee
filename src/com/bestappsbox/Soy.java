package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        description = "Soy";
        cost = 0.7;
        this.beverage = beverage;
    }
}
