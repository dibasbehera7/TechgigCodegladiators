package com.dibas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PowerPuffGirls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Long quantity[] = new Long[size];
        for(int i=0; i<size; i++)
            quantity[i] = scan.nextLong();

        Long qtyInLab[] = new Long[size];
        for(int i=0; i<size; i++)
            qtyInLab[i] = scan.nextLong();

        ArrayList<Long> max = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            max.add(qtyInLab[i]/quantity[i]);
        }

        System.out.println("maximum number will be : "+ Collections.min(max));



    }
}
