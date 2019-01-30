package com.amadeus.birds;

import java.util.HashMap;

public class Shop {


    private HashMap <Integer, String[]> testMap = new HashMap<Integer, String[]>();

    public void getPrintMap(){

        System.out.println("----------");

        for (Integer item: this.testMap.keySet()) {

            System.out.print(item + " ");

            for (String arrStr: this.testMap.get(item)) {

                System.out.print(arrStr + " ");
            }

            System.out.println();
        }

        System.out.println("----------");
    }


    public Double Total (){

        double total = 0;

        for (Integer item: this.testMap.keySet()) {
            total += Double.parseDouble(this.testMap.get(item)[2]) * Double.parseDouble(this.testMap.get(item)[3]);
        }

        return total;
    }


    public void buyBird(User user, Bird bird, Integer qnt) {


        String [] result = new String [4];

        if (bird.getQuantity() > qnt){

            bird.sell(qnt);

            result [0] = user.getName();
            result [1] = bird.getName();
            result [2] = String.valueOf(bird.getPrice());
            result [3] = qnt.toString();

            this.testMap.put(testMap.size()+1, result);

            System.out.println("Ок");
        }
            else System.out.println("not Ok");
    }
}
