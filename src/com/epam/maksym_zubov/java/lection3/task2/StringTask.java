package com.epam.maksym_zubov.java.lection3.task2;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // create a Scanner object
        System.out.println("Enter number of Strings:");
        int n = in.nextInt(); //get number os Strings

        String[] str = new String[n];
        in.nextLine(); // get N Strings from console
        for (int i=0; i<n; i++){
            System.out.println("Insert String number - "+(i+1));
            str[i]=in.nextLine();
        }

        int mediumLength = 0; //count medium length of Strings
        for (int i=0; i<n; i++){
            mediumLength = mediumLength + str[i].length();
        }
        mediumLength = mediumLength/n;

        // print strings which length is longer than medium length and length of this string
        for (int i=0; i<n; i++){
            if (str[i].length() > mediumLength) {
                System.out.println(str[i]+" length - "+str[i].length());
            }
        }
    }
}
