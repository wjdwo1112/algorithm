

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};

        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());

            int[][] arr = new int[n][n];
            int cnt = 1;
            int i = 0;
            int x = 0;
            int y = 0;
            while(cnt <= n*n){
                arr[x][y] = cnt;
                cnt++;

                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= n || ny >= n || nx < 0 || ny < 0 || arr[nx][ny] != 0){
                    i = (i+1)%4;
                    nx = x + dx[i];
                    ny = y + dy[i];
                }

                x = nx;
                y = ny;



            }

            System.out.println("#" + t + " ");
            for(int k=0; k<n; k++){
                for(int j=0; j<n; j++){
                    System.out.print(arr[k][j] + " ");
                }
                System.out.println();
            }


        }

    }
}
