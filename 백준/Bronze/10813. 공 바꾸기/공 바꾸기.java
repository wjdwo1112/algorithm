

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = i;
        }

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int temp1 = 0;
            int temp2 = 0;

            temp1 = arr[a];
            temp2 = arr[b];

            arr[a] = temp2;
            arr[b] = temp1;

        }

        for(int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
