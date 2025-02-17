

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    // BFS(너비 우선 탐색)**은 **"레벨 단위로 탐색"**하는 방식이에요.
    //즉, **현재 이동 횟수가 같은 모든 노드를 먼저 탐색한 후, 다음 레벨(=이동 횟수 증가)**로 넘어갑니다
    //  BFS의 특징
    //✅ 먼저 방문한 위치가 곧 최단 경로
    //✅ 한 번 방문한 위치는 다시 방문하지 않음
    static int n,a,b,c,d;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {1,2,2,1,-1,-2,-2,-1}; // 나이트의 이동 가능 x좌표 변화
    static int[] dy = {2,1,-1,-2,-2,-1,1,2}; // 나의트의 이동 가능 y좌표 변화
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int T = Integer.parseInt(bf.readLine()); //테스트 케이스 개수

        for(int t=0; t<T; t++){
            n = Integer.parseInt(bf.readLine());

            graph = new int[n][n]; //체스판 크기(n x n)
            visited = new boolean[n][n]; // 방문 여부 체크 배열

                st = new StringTokenizer(bf.readLine());
                a = Integer.parseInt(st.nextToken()); //시작 위치 x
                b = Integer.parseInt(st.nextToken()); //시작 위치 y

            st = new StringTokenizer(bf.readLine());
            c = Integer.parseInt(st.nextToken()); //목표 위치 x
            d = Integer.parseInt(st.nextToken()); //목표 위치 y

            System.out.println(bfs(a,b)); //bfs 실행하여 이동 횟수 출력



        }
    }

    public static int bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {x,y,0}); // 큐에 {x좌표, y좌표, 이동 횟수} 삽입
        visited[x][y] = true; // 시작 지점 방문 처리


        while(!q.isEmpty()){ // 큐가 빌때 까지 반복
            int[] cur = q.poll(); // 현재 위치 꺼내기
            int curX = cur[0];
            int curY = cur[1];
            int moves = cur[2]; // 현재 이동 횟수

            // 목표 위치 도착하면 이동 횟수 반환
            if(curX == c && curY == d){
                return moves;
            }

            // 나이트의 8가지 이동 방향 탐색
            for(int i=0; i<8; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                // 체스판 범위 안에 있고, 아직 방문하지 않았다면 이동
                if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
                if(visited[nx][ny]) continue;

                visited[nx][ny] = true; // 방문 처리
                q.offer(new int[]{nx,ny,moves+1}); // 이동 횟수 증가 후 큐에 추가




            }
        }
        return -1; // 도달할 수 없는 경우
    }
}
