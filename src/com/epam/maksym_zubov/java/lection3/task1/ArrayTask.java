package com.epam.maksym_zubov.java.lection3.task1;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = new int[10]; //initiate empty Array of integers

        //fill Array with random numbers from -10 to 10
        for (int i=0; i<10; i++){
            array[i]=(int) Math.round((Math.random()*20)-10);
        }

        //print Array
        System.out.print("Initial Array - ");
        for (int i=0; i<10; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        // calculate sum of even elements (0 - element is even)
        int sum = 0;
        for (int i =0; i<10; i+=2){
            sum=sum+array[i];
        }

        //print received sum
        System.out.print("Sum of even elements ="+sum);
    }
}
