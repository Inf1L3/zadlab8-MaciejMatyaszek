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
public class Ksiazka extends Produkt{

    public Ksiazka (double price, String name, String describe) {
        super(price, name, describe);
    }

    @Override
    public void buy() {
        System.out.println("Kupilem ksiazke!");
    }

    @Override
    public void showInfo() {
       System.out.println("Price:" + getPrice() + " name:" + getName() + " descrie:" + getDescribe());
    }
    
    

    
}
