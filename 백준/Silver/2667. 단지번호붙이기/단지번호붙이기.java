

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static int[][] graph;
    static boolean [][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
         n = Integer.parseInt(bf.readLine());

         graph = new int[n][n];
         visited = new boolean[n][n];

         for(int i=0; i<n; i++){
             String s = bf.readLine();
             for(int j=0; j<n; j++){
                 graph[i][j] = s.charAt(j) - '0';
             }
         }
         int count = 0;
         int[] houseCount = new int[n*n];

         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 if(!visited[i][j] && graph[i][j] == 1){

                     houseCount[count] = bfs(i,j);
                     count++;

                 }
             }
         }

         Arrays.sort(houseCount,0,count);

        System.out.println(count);
        for(int i=0; i< count; i++){
            System.out.println(houseCount[i]);
        }


    }
    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;
        int size = 1;

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx<0 || ny<0 || nx>=n || ny>=n)continue;
                if(visited[nx][ny] || graph[nx][ny] == 0)continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx,ny});
                size++;
            }
        }
        return size;
    }
}
