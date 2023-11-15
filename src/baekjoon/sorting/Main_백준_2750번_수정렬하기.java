package baekjoon.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main_백준_2750번_수정렬하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(bf.readLine());

        }
        //Arrays.sort(arr);
        int tmp = 0;
        for(int i=0; i<n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i]);
            }


    }
}
