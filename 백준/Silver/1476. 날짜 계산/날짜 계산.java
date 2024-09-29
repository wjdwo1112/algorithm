import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int E = 0;
        int S = 0;
        int M = 0;
        int answer = 0;

        while(true){
            E++;
            S++;
            M++;
            answer++;
            if(E>15){
                E = 1;
            }
            if(S>28){
                S = 1;
            }
            if(M > 19){
                M = 1;
            }
            if(e==E && s==S && m==M){
                break;
            }
        }
        System.out.println(answer);

    }
}