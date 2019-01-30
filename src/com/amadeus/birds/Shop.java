package com.amadeus.birds;

import java.util.*;

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


    public void Total (){

        double total = 0;

        for (Integer item: this.testMap.keySet()) {
            total += Double.parseDouble(this.testMap.get(item)[2]) * Double.parseDouble(this.testMap.get(item)[3]);
        }

        System.out.println("Total: " + total);
        System.out.println("***********");
    }


    public void buyBird(User user, Bird bird, Integer qnt) {

        if (bird.getQuantity() > qnt){

            bird.sell(qnt);
            String [] result = new String [4];
            result [0] = user.getName();
            result [1] = bird.getName();
            result [2] = String.valueOf(bird.getPrice());
            result [3] = qnt.toString();

            this.testMap.put(testMap.size()+1, result);

            System.out.println("Ок");
        }
            else System.out.println("not Ok");
    }

    public void getTotalByBirdQnt (String name){

        Double result = 0.0;

        for (Integer item: this.testMap.keySet()) {

            if (this.testMap.get(item)[1].equals(name)){
                result += Double.parseDouble(this.testMap.get(item)[3]);
            }
        }

        System.out.println("total by quantity " + name + ": " + result);
    }


    public void getTotalByBirdPrice (String name){

        Double result = 0.0;

        for (Integer item: this.testMap.keySet()) {

            if (this.testMap.get(item)[1].equals(name)){
                result += Double.parseDouble(this.testMap.get(item)[2]) * Double.parseDouble(this.testMap.get(item)[3]);
            }
        }

        System.out.println("total by price " + name + ": " + result);
    }


    private HashSet getUserSet (){

        HashSet userSet = new HashSet();

        for (Integer item: this.testMap.keySet()) {
            userSet.add(testMap.get(item)[0]);
        }

        return userSet;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(testMap, shop.testMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(testMap);
    }

    public void getUserSetByTotalPrice (){

        TreeMap<Object, Double> userSetByPrice = new TreeMap<>();

        Iterator<String> iter = getUserSet().iterator();

//        System.out.println(getUserSet().size());

        while (iter.hasNext()){

            String localName = iter.next().toString();
            double total = 0;

            for (Integer item: this.testMap.keySet()) {
                if (this.testMap.get(item)[0].equals(localName)){
                    total += Double.parseDouble(this.testMap.get(item)[2]) * Double.parseDouble(this.testMap.get(item)[3]);
                }
            }
            userSetByPrice.put(localName, total);
        }

        System.out.println("-----------");
        for (Object key: userSetByPrice.keySet()) {
            System.out.println("Имя клиента: " +  key + " кол-во потраченных денег: " + userSetByPrice.get(key));
        }
        System.out.println("**********");
    }


    public void getUserSetByQnt (){

        TreeMap<Object, Integer> userSetByQnt = new TreeMap<>();

        Iterator<String> iter = getUserSet().iterator();

//        System.out.println(getUserSet().size());

        while (iter.hasNext()){

            String localName = iter.next().toString();
            int qnt = 0;

//            System.out.println(localName);
            for (Integer item: this.testMap.keySet()) {
                if (this.testMap.get(item)[0].equals(localName)){
                    qnt++;
                }
            }
            userSetByQnt.put(localName, qnt);
        }

        for (Object key: userSetByQnt.keySet()) {
            System.out.println("Имя клиента: " + key + " кол-во покупок: " + userSetByQnt.get(key));
        }

        System.out.println("**********");
    }



}
