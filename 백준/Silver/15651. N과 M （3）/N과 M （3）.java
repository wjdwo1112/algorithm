import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static int n;
    public static int m;
    public static StringBuilder sb = new StringBuilder();
    public static int[] selected;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        selected = new int[m];

        recur(0);
        System.out.print(sb);

    }
    public static void recur(int cur) {

        if (cur == m) {

            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < n; i++) {
            if(cur == m) continue;
            selected[cur] = i+1;
            recur(cur + 1);
        }
    }
}
