

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n+1][n+1];
            System.out.println("#" + t );
            for(int i=1; i<=n; i++){
                arr[i][1] = 1;

                System.out.print(arr[i][1] + " ");
                for(int j=2; j<=i; j++){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}
