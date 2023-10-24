package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1817번_짐챙기는숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int cnt = 0;
        if(n==0){
            System.out.println("0");
            return;
        }
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int box = 1;
        int weight = 0;

        for(int i=0; i<n; i++) {
            weight += arr[i];
            if(weight > m){
                box ++;
                weight = arr[i];
            }


        }
        System.out.println(box);
    }
}
