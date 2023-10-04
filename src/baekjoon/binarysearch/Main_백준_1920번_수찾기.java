package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_백준_1920번_수찾기 {
    public static void main (String[] args) throws IOException,NumberFormatException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(bf.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0; i<m; i++){
            boolean find = false;
            int start = 0;
            int end = n-1;

            while(start <= end){
                int mid = (start+end)/2;
                if(arr[mid] > arr2[i]){
                    end = mid-1;
                }
                else if(arr[mid] < arr2[i]){
                    start = mid+1;
                }else {
                    find = true;
                    break;
                }
            }
            if(find){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
