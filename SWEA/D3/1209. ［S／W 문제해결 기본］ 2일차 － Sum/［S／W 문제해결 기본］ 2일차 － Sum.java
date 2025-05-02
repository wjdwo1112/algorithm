

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for(int t=1; t<=10; t++){
            int [][] arr = new int[100][100];
            int n = Integer.parseInt(bf.readLine());
            for(int i=0; i<100; i++) {
                st = new StringTokenizer(bf.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

                int max = 0;

                //행의 합
                for(int i=0; i<100; i++){
                    int sum = 0;
                    for(int j=0; j<100; j++){
                        sum += arr[i][j];
                    }
                    max = Math.max(sum,max);
                }
                //열의 합

                for(int j=0; j<100; j++){
                    int sum = 0;
                    for(int i=0; i<100; i++){
                        sum += arr[i][j];
                    }
                    max = Math.max(sum,max);
                }

                //대각선의 합
                int diag_sum = 0;
                for(int i=0; i<100; i++){
                    for(int j=0; j<100; j++){
                        if(i==j) {
                            diag_sum += arr[i][j];
                        }
                    }
                }

                max = Math.max(diag_sum,max);
            System.out.println("#" + t + " " + max);

        }
    }
}
