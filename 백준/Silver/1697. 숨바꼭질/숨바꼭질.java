import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int n,k;
    static int[] graph;
    static boolean[] visited;
    
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

         n = Integer.parseInt(st.nextToken());
         k = Integer.parseInt(st.nextToken());

        graph = new int[100001];
        visited = new boolean[100001];

        if (n == k) {
            System.out.println(0);
            return;
        }

        System.out.println(bfs(n));
    }

    public static int bfs(int x){
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        visited[x] = true;
        

        while(!q.isEmpty()){
            int cur = q.poll();

            int[] moves = {cur-1, cur+1, cur*2}; // 이동할 위치들 배열로 선언
            for(int i=0; i<3; i++){
                int next = moves[i]; 
                //int next = cur + moves[i];로 되어 있는데, 이는 moves[i] 값을 더한 방식으로 계산하고 있습니다. 
                //하지만 moves 배열의 값은 이미 이동할 방향이므로, next를 계산할 때 cur + moves[i]가 아니라 next = moves[i]로 바로 계산해야 합니다.
                
                if(next<0 || next>100000 )continue; //범위 체크
                if(visited[next]) continue; // 방문여부 체크

                visited[next] = true;
                graph[next] = graph[cur] + 1; // 시간 갱신
               

                 // 목표 위치에 도달하면 바로 종료
                if(next == k){
                    return graph[next];
                    
                }
                q.offer(next);
            }
            
        }
        return -1;
    }
}