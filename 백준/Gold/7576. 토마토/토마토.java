

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    //한 번에 여러 개의 익은 토마토(1)에서 동시에 퍼져 나가야 한다.
    static int M,N;
    static int[][] graph;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];

        Queue<int[]>q = new LinkedList<>();


        for(int i=0; i<N; i++){
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<M; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 1){
                    q.offer(new int[]{i,j,0}); // 익은 토마토 위치와 날짜 큐에 추가
                }
            }
        }

        int max = bfs(q); //bfs 실행

        // 모든 토마토가 익었느지 확인
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(graph[i][j] == 0){ // 안익은 토마토가 있으면 -1 출력 후 종료
                    System.out.println(-1);
                    return;
                }
            }
        }

        System.out.println(max); //최소 일수 출력





    }
    public static int bfs(Queue<int[]>q){


        int maxdays = 0;


        while(!q.isEmpty()){
            int[] cur = q.poll(); //현재 좌표
            int curX = cur[0];
            int curY = cur[1];
            int days = cur[2]; //경과한 날짜
            maxdays = Math.max(maxdays,days); // 최대 날짜 갱신


            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 범위 초과, 빈 공간(-1), 이미 방문한 경우 제외
                if(nx<0 || ny<0 || nx>=N || ny>=M)continue;
                if(graph[nx][ny] != 0 ) continue; // 빈칸(-1) 또는 이미 익은 토마토(1) 패스 (안 익은거만 체크 할라고)

                graph[nx][ny] = 1; // 익은 상태로 변경
                q.offer(new int []{nx,ny,days+1}); // 날짜 +1 후 큐에 추가

            }
        }

        return maxdays;
    }
}
