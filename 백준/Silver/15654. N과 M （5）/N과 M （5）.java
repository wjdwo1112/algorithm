import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int n;
    public static int m;
    public static boolean visited[];
    public static int arr[];
    public static int selected[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visited = new boolean[n];
        selected = new int[m];
        arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){

            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        recur(0);
        System.out.println(sb);
    }
    private static void recur(int cur){
        if(cur == m){
            for(int i=0; i<m; i++){
                sb.append(selected[i]).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=0; i<n; i++){
            if(visited[i])continue;
            selected[cur] = arr[i];
            visited[i] = true;
            recur(cur + 1);
            selected[cur] = -1;
            visited[i] = false;
        }
    }

}
