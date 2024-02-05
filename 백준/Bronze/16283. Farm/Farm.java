import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int cnt = 0;
        int sheep = 0;
        int goat = 0;

        for(int i=1; i<n; i++){
            for(int j=1;j<n;j++){
                if(((i+j) == n) && (a*i+b*j == w)){
                    cnt++;
                    sheep = i;
                    goat = j;
                }
            }
        }

        if(cnt == 1){

            System.out.println(sheep +" " + goat);
        }else{
            System.out.println("-1");
        }
    }
}
