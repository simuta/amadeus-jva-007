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


        Bird birdOne = new Bird("Sova", 20.5, 10);
        Bird birdTwo = new Bird("Orel", 50, 2);


        HashMap <Integer, String[]> testMap = new HashMap<Integer, String[]>();
        Shop testShop = new Shop();


        testMap.put(testMap.size()+1, testShop.buyBird(userOne,  birdOne, 1));
        testMap.put(testMap.size()+1, testShop.buyBird(userTwo,birdTwo, 2));


        testShop.getPrintMap(testMap);
        System.out.println("Total: " + testShop.Total(testMap));

    }
}
