import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
        static int N;
        static int M;
        static int[][] graph;
        static boolean[][] visited;
        static int[] dx = {-1,1,0,0}; //상하좌우
        static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M]; //미로 배열

        for(int i=0; i<N; i++){
            String s = bf.readLine();
            for(int j=0; j<M; j++){
                graph[i][j] = s.charAt(j) - '0'; //문자열을 숫자로 변환
            }
        }

        int result = bfs(0,0);
        System.out.println(result);


    }

    public static int bfs(int x, int y){
        visited = new boolean[N][M]; //방문 여부 배열
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true; //시작점 방문 표시

        while(!q.isEmpty()){
            int[] current = q.poll(); // 현재 방문할 노드를 큐에서 꺼냄
            int curX = current[0]; // curX, curY는 현재 위치의 좌표를 나타냄
            int curY = current[1]; // 큐에 들어가는 데이터는 {x,y} 형태의 배열

            // 네 방향 (상,하,좌,우) 이동을 위한 반복문
            // dx[i], dy[i]를 이용해 위치 이동
            for(int i=0; i<4; i++){
                // 새로운 위치 계산(nx, ny)
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                //예외 처리 (범위를 벗어나면 continue)
                // 이동한 위치가 미로 밖으로 나가면 스킵
                // (nx, ny)가 배열의 범위를 벗어나지 않도록 함
                if(nx<0 || ny<0 || nx >= N || ny >= M) continue;

                // 방문 여부 및 벽(0) 체크
                // 방문한 곳을 다시 탐색하면 불필요한 중복이 발생한다.
                // visited[nx][ny] == true -> 이미 방문한 곳이라면 X
                // graph[nx][ny] == 0 -> 벽이면 X
                if(visited[nx][ny] || graph[nx][ny] == 0) continue;

                // 이동 가능하면 방문 처리 및 거리 증가
                visited[nx][ny] = true;
                graph[nx][ny] = graph[curX][curY] + 1; // 이동 거리 증가
                q.offer(new int[]{nx,ny});


            }
        }
        return graph[N-1][M-1]; // 도착점의 값 반환
    }
}
