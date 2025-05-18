

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
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n][n];

            for(int i=0; i<n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] r90 = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    r90[i][j] = arr[n-1-j][i];
                }

            }

            int[][] r180 = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; j++) {
                    r180[i][j] = arr[n - 1 - i][n - 1 - j];
                }
            }

            int[][] r270 = new int[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    r270[i][j] = arr[j][n-1-i];
                }
            }

            System.out.println("#" + t);

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(r90[i][j]);
                }
                System.out.print(" ");
                for(int j=0; j<n; j++){
                    System.out.print(r180[i][j]);

                }
                System.out.print(" ");
                for(int j=0; j<n; j++){
                    System.out.print(r270[i][j]);
                }
                System.out.println();
            }

        }
    }
}
