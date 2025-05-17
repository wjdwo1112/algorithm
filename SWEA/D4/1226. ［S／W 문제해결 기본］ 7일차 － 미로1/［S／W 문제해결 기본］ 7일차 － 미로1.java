

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    static int [][] arr ;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        for(int t=1; t<=10 ;t++) {
            int T = Integer.parseInt(bf.readLine());

            arr= new int[16][16];
            int startX = 0;
            int startY = 0;
            int arriveX = 0;
            int arriveY = 0;
            for(int i=0; i<16; i++) {
                String line = bf.readLine();
                for (int j = 0; j < 16; j++) {
                    arr[i][j] = line.charAt(j) - '0';
                    if (arr[i][j] == 2) {
                        startX = i;
                        startY = j;
                    }
                    if (arr[i][j] == 3) {
                        arriveX = i;
                        arriveY = j;
                    }
                }
            }
                int x = startX;
                int y = startY;
                int targetX = arriveX;
                int targetY = arriveY;
                visited = new boolean [16][16];

                int result = bfs(x,y,targetX,targetY);
                System.out.println("#" + t + " " + result);



        }
    }

    public static int bfs(int x, int y, int targetX, int targetY){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            if(curX == targetX && curY == targetY){
                return 1;
            }

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx < 0 || ny < 0 || nx>=16 || ny>= 16) continue;
                if(visited[nx][ny] || arr[nx][ny] == 1) continue;
                visited[nx][ny] = true;
                q.offer(new int[] {nx,ny});
            }
        }
        return 0;
    }
}
