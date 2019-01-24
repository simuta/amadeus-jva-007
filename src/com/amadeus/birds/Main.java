package com.amadeus.birds;

public class Main
{

    public static void main(String[] args)
    {
//        System.out.println("Demo HERE!!!");

        User userOne = new User("Homer");

        System.out.println("User: " + userOne.getName());

        Bird birdOne = new Bird("Sova", 20.5, 10);

        System.out.println("Товар: " + birdOne.getName() + " " + birdOne.getPrice() + " " + birdOne.getQuantity());


        birdOne.sell(2);

        System.out.println("Товар один: " + birdOne.getName() + " " + birdOne.getPrice() + " " + birdOne.getQuantity());


        birdOne.addBird(10);
        System.out.println("Товар один: " + birdOne.getName() + " " + birdOne.getPrice() + " " + birdOne.getQuantity());

    }
}
