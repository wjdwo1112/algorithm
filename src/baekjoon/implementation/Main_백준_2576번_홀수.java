package baekjoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_2576번_홀수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[7];
        int sum = 0;
        int min = 99;
        for(int i=0; i<7; i++){
            arr[i] = Integer.parseInt(bf.readLine());

            if(arr[i] % 2 == 1){
               sum += arr[i];
               if(arr[i] < min ){
                   min = arr[i];
               }
            }

        }
        if(sum == 0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
