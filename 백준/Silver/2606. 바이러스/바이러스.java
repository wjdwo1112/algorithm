
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(bf.readLine()); // 노드의 갯수
        m = Integer.parseInt(bf.readLine()); // 간선의 갯수

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        StringTokenizer st;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(bf.readLine());
            // 노드의 쌍
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1; //무방향 그래프
        }
        System.out.println((bfs(1)));


    }
    public static int bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        int count = 0;// 감염된 컴퓨터 개수 (1번 제외)

        while(!q.isEmpty()){
            int cur = q.poll();


            for(int i=1; i<=n; i++){
                if(visited[i]) continue;
                if(graph[cur][i] == 0) continue;

                visited[i] = true;
                q.offer(i);
                count++;

            }
        }
        return count;
    }
}
