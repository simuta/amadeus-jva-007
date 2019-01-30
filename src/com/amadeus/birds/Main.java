package com.amadeus.birds;

import java.util.HashMap;
import java.util.Map;

public class Main
{

    public static void main(String[] args)
    {
//        System.out.println("Demo HERE!!!");

        User userOne = new User("Homer");
        User userTwo = new User("Bart");
        User userThree = new User("Lisa");


        Bird birdOne = new Bird("Sova", 20.5, 10);
        Bird birdTwo = new Bird("Orel", 50, 5);
        Bird birdThree = new Bird("Vorobey", 23, 7);

        Shop testShop = new Shop();

        testShop.buyBird(userOne,  birdOne, 1);
        testShop.buyBird(userTwo,birdTwo, 2);
        testShop.buyBird(userTwo,birdOne, 5);
        testShop.buyBird(userOne,birdThree, 1);
        testShop.buyBird(userOne,birdThree, 25);
        testShop.buyBird(userThree,birdOne, 1);
        testShop.buyBird(userOne,birdOne, 1);

        testShop.getPrintMap();
        testShop.Total();

        testShop.getTotalByBirdQnt(birdOne.getName());
        testShop.getTotalByBirdPrice(birdOne.getName());


        testShop.getUserSetByTotalPrice();
        testShop.getUserSetByQnt();

    }
}
