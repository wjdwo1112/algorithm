import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int rate = (int)((long) y * 100 / x );
        
        
        int start = 0;
        int end = (int)1_000_000_000;
        int cnt = -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if( (int)((long)(y+mid)*100/(x+mid)) != rate ){
                cnt = mid;
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(cnt);
    }
}
