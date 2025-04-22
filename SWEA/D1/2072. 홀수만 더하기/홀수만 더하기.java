

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
            int[] arr = new int[10];
            st = new StringTokenizer(bf.readLine());
            int sum = 0;
            for(int i=0; i<10; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                if(arr[i] % 2 != 0){
                    sum += arr[i];
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
