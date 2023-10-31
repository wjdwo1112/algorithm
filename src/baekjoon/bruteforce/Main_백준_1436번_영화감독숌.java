package baekjoon.bruteforce;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_백준_1436번_영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int start = 666;
        int cnt = 1;
        while(cnt != n){
            start ++;
            if(String.valueOf(start).contains("666")){
                cnt++;
            }
        }
        System.out.println(start);
    }
}
