package com.dibas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BaybladeWorldTournament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for (int t = 0; t < testcase; t++) {

            int size = scan.nextInt();

            Long teamG[] = new Long[size];
            for(int i=0; i<size; i++)
                teamG[i] = scan.nextLong();

            Long teamO[] = new Long[size];
            for(int i=0; i<size; i++)
                teamO[i] = scan.nextLong();

            ArrayList<Long> teamA = new ArrayList<>(Arrays.asList(teamG));
            Collections.sort(teamA, Collections.reverseOrder());
            ArrayList<Long> teamB = new ArrayList<>(Arrays.asList(teamO));
            Collections.sort(teamB, Collections.reverseOrder());


            int count = 0;
            int k=0;
            for (int i = 0; i < size; i++) {
                for(int j=count; j<size; j++){
                    if(teamA.get(i) > teamB.get(j)){
                        count = j+1;
                        k++;
                        break;
                    }
                }
            }

            System.out.println(k);

        }

    }
}
