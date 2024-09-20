import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int[] rank = new int[p];
        if(n == 0){
            System.out.println(1);
            return;
        }
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            rank[i] = Integer.parseInt(st.nextToken());
        }

        if( p==n && rank[p-1]>=score){
            System.out.println(-1);
            return;
        }
        int cnt = 1;
        for(int i=0; i<n; i++){

            if(rank[i]>score){
                cnt++;
            }else {
                break;
            }
        }
        System.out.println(cnt);

    }
}
