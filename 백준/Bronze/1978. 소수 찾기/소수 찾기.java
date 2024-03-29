import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(bf.readLine());
        st = new StringTokenizer(bf.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            for(int j=2; j<=num; j++){
                if(j == num){
                    cnt++;
                }if(num % j==0){
                    break;
                }
            }
        }
        System.out.println(cnt);



    }
}