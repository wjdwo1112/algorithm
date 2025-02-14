

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // 1. 전체 탐색(모든 그림을 찾는 부분)
    // 새로운 그림을 찾는 조건을 검사해야 한다.
    // 아직 방문하지 않은 1을 찾으면 bfs를 호출

    // 2. bfs탐색(그림의 크기를 구하는 부분)
    // bfs 함수 내부에서 "연결된 그림의 크기를 탐색하는 조건"
    // while 문 안에서 상하좌우로 이동할 때 경계 조건을 체크하고,
    // 아직 방문하지 않은 1을 만나면 큐에 추가하는 것이다.
        static int n;
        static int m;
        static boolean [][] visited;
        static int[][] graph;
        static int[] dx = {-1,1,0,0};
        static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<m; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0; //그림 개수
        int maxSize = 0; // 가장 큰 크림의 크기

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(!visited[i][j] && graph[i][j] == 1){ // 새로운 그림 발견
                    count++; // 그림 개수 증가
                    maxSize = Math.max(maxSize, (bfs(i,j))); // bfs 실행하여 넓이 계산
                }
            }
        }

        System.out.println(count);
        System.out.println(maxSize);



    }
    public static int bfs(int x, int y){

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x,y}); // 시작점 큐에 추가
        visited[x][y] = true; // 시작점 방문 처리
        int size = 1; // 현재 그림 크기(시작점 포함)

        //bfs 실행
        while(!q.isEmpty()){
            int[] current = q.poll(); // 큐에서 하나 꺼냄
            int curX = current[0];
            int curY = current[1];

            //상하좌우 탐색
            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if(visited[nx][ny] || graph[nx][ny] == 0) continue;

                visited[nx][ny] = true; //방문 처리
                q.offer(new int[]{nx,ny}); // 큐에 추가
                size++; // 넓이 증가

            }
        }
        return size; // 최종 그림의 넓이 반환
    }
}
