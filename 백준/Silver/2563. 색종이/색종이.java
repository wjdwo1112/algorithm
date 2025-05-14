

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[][] arr = new int[100][100];


        for(int i = 0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int j = x; j< x+10; j++){
                for(int k = y; k< y+10; k++){
                    arr[j][k] = 1;
                }
            }
        }

        int cnt = 0;

        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j] == 1){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);




    }
}
