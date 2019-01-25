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

//        System.out.println("User: " + userOne.getName());

        Bird birdOne = new Bird("Sova", 20.5, 10);
        Bird birdTwo = new Bird("Orel", 50, 2);


        Map <Integer, String[]> testMap = new HashMap<>();
        testMap.put(0, new String[] {userOne.getName(), birdOne.getName(), String.valueOf(birdOne.getPrice()), "1"});
        testMap.put(1, new String[] {userTwo.getName(), birdTwo.getName(), String.valueOf(birdTwo.getPrice()), "2"});


        for (int i=0; i < testMap.size(); i++) {
            String [] t = (String[]) testMap.get(i);

            for (int j=0; j<t.length; j++) {
                System.out.print(t[j] + " ");
            }
            System.out.println();
        }
    }
}
