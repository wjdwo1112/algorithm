import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int cnt = 0;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i*i == j*j+n){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}