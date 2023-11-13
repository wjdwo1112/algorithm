package baekjoon.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_백준_11659번_구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n+1];
        long[]sum = new long[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum[i] = sum[i-1]+arr[i];
        }

        for(int k=1; k<=m; k++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sum[j]-sum[i-1]);
        }
    }
}
