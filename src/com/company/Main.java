package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String[][] array = new String[n][n];
        double tmp = n/2 + 0.5;
        int[] botPos = new int[]{in.nextInt(), in.nextInt()};

        in.nextLine();
        for (int i = 0; i < n; i++){
            char[] board = in.nextLine().toCharArray();

            for (int j = 0; j < n; j++){
                array[i][j] = String.valueOf(board[j]);
            }
        }
        array[botPos[0]][botPos[1]] = "m";

        int[] ploc = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(array[i][j].contains("p")){
                    ploc[0] = i;
                    ploc[1] = j;
                }
            }
        }

        List<String> directions = new ArrayList<>();

        if (ploc[0] > botPos[0]){
            botPos[0] ++;
            directions.add("DOWN");
        } else if (ploc[0] < botPos[0]) {
            directions.add("UP");
            botPos[0] --;
        } else if (ploc[1] > botPos[1]){
            directions.add("RIGHT");
            botPos[1] ++;
        } else if (ploc[1] < botPos[1]){
            directions.add("LEFT");
            botPos[1] --;
        }

        for (int k = 0; k < directions.size(); k++){
            System.out.print(directions.get(k));
            System.out.print('\n');
        }
    }
}