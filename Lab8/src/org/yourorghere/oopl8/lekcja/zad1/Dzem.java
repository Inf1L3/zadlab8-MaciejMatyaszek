/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere.oopl8.lekcja.zad1;

/**
 *
 * @author student
 */
public class Dzem extends Produkt {

    public Dzem(double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("Kupiłem dżem");
    }

    @Override
    public void showInfo() {
        System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }
    
    
}
