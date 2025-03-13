
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        int[] cow = new int[11];


        for(int i=1; i<=10; i++){
            cow[i] = -1;
        }
        int cnt = 0;



        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(cow[a] == -1){
                cow[a] = b;
            }else if (cow[a] != b){
                cnt++;
                cow[a] = b;
            }


        }
        System.out.println(cnt);


    }
}
