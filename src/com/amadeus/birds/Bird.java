package com.amadeus.birds;

public class Bird {

    private String name;
    private double price;
    private int quantity;

    public Bird (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

    public void addBird (int addBird){
        this.quantity += addBird;
    }

}
