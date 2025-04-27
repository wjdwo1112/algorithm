

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int t=1; t<=10; t++){
            int n = Integer.parseInt(bf.readLine());
            int[] arr = new int[101];
            st = new StringTokenizer(bf.readLine());
            for(int i=1; i<=100; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int i = 1;
            while(i<=n){
                arr[100]--;
                arr[1]++;
                Arrays.sort(arr);
                i++;
            }
            int result = arr[100] - arr[1];
            System.out.println("#" + t + " " + result);
        }
    }
}
