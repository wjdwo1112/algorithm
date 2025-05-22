

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            st = new StringTokenizer(bf.readLine());
            int[] arr = new int[5];
            int sum  = 0;
            for(int i=0; i<5; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i]< 40){
                    arr[i] = 40;
                }
                sum = sum + arr[i];
            }
            int avg = sum / 5;
            System.out.println("#" + t + " " + avg);
        }
    }
}
