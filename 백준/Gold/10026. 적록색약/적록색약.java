

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(bf.readLine());
        graph = new char[n][n];


        for(int i=0; i<n; i++){
            String s = bf.readLine();
            for(int j=0; j<n; j++){
                graph[i][j] = s.charAt(j) ;
                 // R:82 G:71 B:66
            }
        }


        visited = new boolean[n][n]; //방문 배열 초기화
        int normalCount = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){ // 아직 방문하지 않은 영역이면
                    bfs(i,j,false); // 일반인 bfs
                    normalCount++;
                }
            }
        }


        visited = new boolean[n][n]; // 방문 배열 다시 초기화
        int colorBlindCount = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){ // 아직 방문하지 않은 영역이면
                    bfs(i,j,true); // 적록색약 bfs
                    colorBlindCount++;
                }
            }
        }
        System.out.println(normalCount + " " + colorBlindCount);
    }

    public static void bfs(int x, int y, boolean isColorBlind){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;
        char color = graph[x][y];

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int curX = cur[0];
            int curY = cur[1];

            for(int i=0; i<4; i++) {
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;
                if (visited[nx][ny]) continue;

                if (isColorBlind) { // 적록색약인경우
                    if(color == 'B'){ // 파란색이면 같은 파란색만 탐색
                        if(graph[nx][ny] == 'B') {
                            visited[nx][ny] = true;
                            q.offer(new int[]{nx, ny});
                        }
                    }else { // R 또는 G 이면 R/G를 같은색으로 탐색
                        if(graph[nx][ny] == 'R' || graph[nx][ny] == 'G') { 
                            visited[nx][ny] = true;
                            q.offer(new int[]{nx, ny});
                        }
                    }
                } else { // 일반인인 경우
                    if(graph[nx][ny] == color) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
