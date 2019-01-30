package com.amadeus.birds;

import java.util.Objects;

public class Bird {

    private String name;
    private double price;
    private int quantity;

    public Bird (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Bird (){

    }

    public void setName (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice (double price){
        this.price = price;
    }

    public double getPrice () {
        return price;
    }

    public void setQuantity (int quantity){
        this.quantity = quantity;
    }

    public int getQuantity () {
        return quantity;
    }


    public void sell (int qntSell){
        this.quantity -= qntSell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Double.compare(bird.price, price) == 0 &&
                quantity == bird.quantity &&
                Objects.equals(name, bird.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, quantity);
    }

    public void addBird (int addBird){

        this.quantity += addBird;
    }

}
