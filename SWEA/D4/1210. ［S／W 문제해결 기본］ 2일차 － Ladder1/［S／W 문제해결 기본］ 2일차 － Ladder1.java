

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        for(int t=1; t<=10; t++){
            int T = Integer.parseInt(bf.readLine());
            int[][] arr = new int[100][100];

            int startX = 0;
            int startY = 0;
            for(int i=0; i<100; i++){
                st = new StringTokenizer(bf.readLine());
                for(int j=0; j<100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if(arr[i][j] == 2){
                        startX = i;
                        startY = j;
                    }
                }
            }

            int x = startX;
            int y = startY;

            while(x > 0){
                // 왼쪽 이동 가능한지 확인
                if(y > 0 && arr[x][y-1] == 1){
                    while(y > 0 && arr[x][y-1] == 1){
                        y--;
                    }
                } else if
                //오른쪽 이동 가능한지 확인
                 (y < 99 && arr[x][y+1] == 1){
                    while(y < 99 && arr[x][y+1] == 1){
                        y++;
                    }
                }

                //위쪽 이동 가능한지 확인
                x--;
            }

            System.out.println("#" + t + " " + y);




        }
    }
}
