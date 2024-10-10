import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] e = new int[1000001];
        int cnt = 1;
        int i = 1;
        while(true){
            if(cnt > 1000000)break;
            boolean[] g = new boolean[10];
            boolean check = false;
            int copy = i;
            while (copy > 0){
                if(g[copy % 10]){
                    check = true;
                    break;
                }
                g[copy % 10] = true;
                copy /= 10;
            }
            i++;
            
            if(check == false){
                e[cnt] = i;
                cnt++;
            }
            
             if(i % 100000 == 0) System.gc();
        }

        while(true){
            int n = Integer.parseInt(bf.readLine());
            if(n==0) break;
            System.out.println(e[n] - 1);
        }


    }

}
