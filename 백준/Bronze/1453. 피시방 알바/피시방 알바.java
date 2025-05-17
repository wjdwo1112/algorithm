

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int [] arr = new int[101];
        int cnt = 0;
        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){

            int a = Integer.parseInt(st.nextToken());
            if(arr[a] != 0){
                cnt++;
            }else{
                arr[a] = a;
            }
        }

        System.out.println(cnt);
    }
}
