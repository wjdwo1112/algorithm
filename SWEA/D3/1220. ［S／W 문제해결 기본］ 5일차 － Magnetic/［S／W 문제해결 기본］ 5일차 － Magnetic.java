

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int t=1; t<=10 ;t++){
            int n = Integer.parseInt(bf.readLine());
            int[][] arr = new int[n+1][n+1];

            for(int i=1; i<=n; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=1; j<=n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;

            for(int i=1; i<=n; i++){

                boolean check = false;

                for(int j=1; j<=n; j++){

                    if(arr[j][i] == 1){
                        check = true;
                    }else if(check == true && arr[j][i] == 2){
                        cnt++;
                        check = false;
                    }

                }


            }

            System.out.println("#" + t + " " + cnt);
        }
    }
}
