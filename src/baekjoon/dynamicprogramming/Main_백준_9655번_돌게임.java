package baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_백준_9655번_돌게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int[] D = new int[n+1];
        String winner = null;
        for(int i=1; i<=n; i++){
            D[i] = i;
            if(D[i] % 2 == 1){
                winner ="SK";
            }else{
                winner = "CY";
            }
        }
        System.out.println(winner);


    }
}
