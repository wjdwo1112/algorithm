import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n,m,k;
    static boolean[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(bf.readLine());
        for(int t=0; t<T; t++){
            st = new StringTokenizer(bf.readLine());
             m = Integer.parseInt(st.nextToken());
             n = Integer.parseInt(st.nextToken());
             k = Integer.parseInt(st.nextToken());

             graph = new boolean[m][n];


             for(int i=0; i<k; i++){
                 st = new StringTokenizer(bf.readLine());
                 int a = Integer.parseInt(st.nextToken());
                 int b = Integer.parseInt(st.nextToken());
                 graph[a][b] = true;
             }
             visited = new boolean[m][n];
             int count = 0;

             for(int i=0; i<m; i++){
                 for(int j=0; j<n; j++){
                     if(!visited[i][j] && graph[i][j] == true){
                         count++;
                         bfs(i,j);

                     }
                 }
             }
            System.out.println(count);




        }
    }

    public static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] current = q.poll();
            int curX = current[0];
            int curY = current[1];

            for(int i=0; i<4; i++){
                int nx = curX + dx[i];
                int ny = curY + dy[i];

                if(nx<0 || ny<0 || nx>=m || ny>=n)continue;
                if(visited[nx][ny] || graph[nx][ny] == false) continue;

                visited[nx][ny] = true;
                q.offer(new int[]{nx,ny});

            }
        }
    }
}
