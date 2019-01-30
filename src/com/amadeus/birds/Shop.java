package com.amadeus.birds;

import java.util.HashMap;

public class Shop {


    public void getPrintMap(HashMap<Integer, String[]> tMap){

        System.out.println("----------");

        for (Integer item: tMap.keySet()) {

            System.out.print(item + " ");

            for (String arrStr: tMap.get(item)) {

                System.out.print(arrStr + " ");
            }

            System.out.println();
        }

        System.out.println("----------");
    }


    public Double Total (HashMap<Integer, String[]> tMap){

        double total = 0;

        for (Integer item: tMap.keySet()) {
            total += Double.parseDouble(tMap.get(item)[2]) * Double.parseDouble(tMap.get(item)[3]);
        }

        return total;
    }


    public String [] buyBird(User user, Bird bird, Integer qnt) {

        bird.sell(qnt);

        String [] result = new String [4];

        result [0] = user.getName();
        result [1] = bird.getName();
        result [2] = String.valueOf(bird.getPrice());
        result [3] = qnt.toString();

        return result;
    }
}
