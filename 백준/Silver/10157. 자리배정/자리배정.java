

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int c = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[r+1][c+1];
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};

        int k = Integer.parseInt(bf.readLine());

        if(k > c*r){
            System.out.println(0);
        }else {
            int x = r;
            int y = 1;
            int dir = 0;
            for(int i=1; i<= c*r; i++){
                arr[x][y] = i;
                if(i == k){
                    System.out.println(y + " " + (r-x+1));
                    break;
                }

                int nx = x + dx[dir];
                int ny = y + dy[dir];

                if(nx < 1 || ny < 1 || nx > r || ny > c || arr[nx][ny] != 0){
                    dir = (dir + 1) % 4;
                    nx = x + dx[dir];
                    ny = y + dy[dir];
                }

                x = nx;
                y = ny;
            }
        }





    }
}
