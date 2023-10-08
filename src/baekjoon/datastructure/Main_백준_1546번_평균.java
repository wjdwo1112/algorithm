package baekjoon.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_1546번_평균 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n= Integer.parseInt(bf.readLine());
        int[]arr = new int[n];
        float max = 0;
        float sum = 0;

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        for(int i=0; i<n; i++){
            sum += (float)arr[i]/max*100;
        }
        System.out.println((float)sum/n);
    }
}
