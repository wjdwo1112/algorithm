

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    static int n;
    static char[][] arr ;
    static boolean[][] visited;
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=1; t<=T; t++){
             n = Integer.parseInt(bf.readLine());
            arr = new char[n][n];
            for(int i=0; i<n; i++){
                String line = bf.readLine();
                for(int j=0; j<n; j++){
                    arr[i][j] = line.charAt(j);
                }
            }
            visited = new boolean[n][n];
            int cnt = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(!visited[i][j] && arr[i][j] == '.' && countMines(i,j) == 0) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }


            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(!visited[i][j] && arr[i][j] == '.'){
                        visited[i][j] = true;
                        cnt++;
                    }
                }
            }

            System.out.println("#" + t + " " + cnt);

        }
    }

    public static int countMines(int x, int y){
        int count = 0;

        for(int i=0; i<8; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && ny >= 0 && nx < n && ny < n && arr[nx][ny] == '*'){
                count++;
            }
        }
        return count;
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            if(countMines(curX,curY) == 0) {
                for (int i = 0; i < 8; i++) {
                    int nx = curX + dx[i];
                    int ny = curY + dy[i];


                    if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                    if (visited[nx][ny] || arr[nx][ny] == '*') continue;
                    visited[nx][ny] = true;
                    q.offer(new int[]{nx, ny});

                }
            }
        }

    }
}
