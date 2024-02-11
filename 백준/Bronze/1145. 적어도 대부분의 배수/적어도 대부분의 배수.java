import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] arr = new int[5];
        int cnt = 0;
        int a = 1;
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(true){
            cnt = 0;
            for(int i=0; i<5; i++){
                if(a % arr[i] == 0){
                    cnt ++;
                }
            }

            if(cnt >=3){
                break;
            }
            a++;
        }
        System.out.println(a);
    }
}
