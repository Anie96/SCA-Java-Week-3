package com.anifahbhadmus;

import com.sun.jdi.connect.spi.TransportService;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// start collections routine
        collectionsRoutine();
    }

   static void collectionsRoutine(){
        //create an instance of random class
        Random rd = new Random();

        //create new array list of integers
        ArrayList<Integer> numberList = new ArrayList<Integer>();

        //add random numbers till there are 20 numbers
        while(numberList.size() < 20){
         numberList.add(rd.nextInt(300));
        }

        //create the hashmap
        HashMap<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        numberList.forEach((number) -> numberMap.put(number * 10, number)
        );

        iteratorRoutine(numberList);

    }

   static void iteratorRoutine(ArrayList<Integer> numberList){

        //create iterator
        Iterator<Integer> iter = numberList.iterator();

        //create Linked List
        LinkedList<Integer> numberLinkedList = new LinkedList<>();

        while(iter.hasNext()){
            int currentNumber = iter.next();

            if(currentNumber% 2 == 0 || currentNumber % 5 == 0){
                numberLinkedList.add(currentNumber);
            }
        }

        //clone initial list and append new values
        LinkedList <Integer> newNumberLinkedList = (LinkedList<Integer>) numberLinkedList.clone();
        numberLinkedList.forEach((number) -> newNumberLinkedList.add(number -1)
        );


        //print the 10th and 50th item in final linked list
        try {
            System.out.println("\n");
            System.out.println("The 10th Value in final linkedlist is: " + newNumberLinkedList.get(9));
            System.out.println("The 50th Value in final linkedlist is: " + newNumberLinkedList.get(49));
            System.out.println("\n");
        }
        catch (Exception e){
            System.out.println("\n");
            System.out.println("Error Handled");
            System.out.println("Completed successfully");
            System.out.println("\n");
        }

        //create a Hashset from the linkedlist and a set of multipples of five up to 25
        Set<Integer> numberSet = new HashSet<>(newNumberLinkedList);
        Set<Integer> multiplesOfFive = new HashSet<>(Arrays.asList(5,10,15,20, 25));

        //check if set contains any multiple of five up to 25
        if(Collections.disjoint(numberSet, multiplesOfFive) == false){
            System.out.println("Final HashSet contains multiples of 5 (up to 25)");
        }
        else{
            System.out.println("Final HashSet does not contain multiples of 5 (up to 25)");
        }


       System.out.println("\n");
       System.out.println("Printing values from final HashSet");
        //print some values from the resulting HashSet
       numberSet.forEach(number -> System.out.println(number));







    }
}
