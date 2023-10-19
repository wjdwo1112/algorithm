package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_2839번_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        int result = -1;

        for(int i=0; i*5<=n; i++){
            for(int j=0; i*5+j*3<=n; j++){
                if(i*5 + j*3 == n){
                    result = i+j;
                }
            }
        }
        System.out.println(result);




    }
}
