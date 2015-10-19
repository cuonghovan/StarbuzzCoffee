package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Whip extends CondimentDecorator{
    public Whip (Beverage beverage){
        description = "Whip";
        cost = 0.1;
        this.beverage = beverage;
    }
}
