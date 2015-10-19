package com.bestappsbox;

/**
 * Created by cuonghv on 10/19/15.
 */
public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 1.9;
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
