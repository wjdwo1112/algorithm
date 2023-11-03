package baekjoon.arrayandlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_백준_2577번_숫자의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int d = a * b * c;

        int[]arr = new int [10];


        String e = String.valueOf(d);
        for(int i=0; i<e.length();i++){
            arr[e.charAt(i) - '0']++;

        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
