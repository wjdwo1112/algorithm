package swexpertacademy.d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_2063번_중간값찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        for(int i=0; i<N ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start = 0;
        int end = N-1;
        int result = 0;
        for(int i=0; i<N; i++){
            int mid = (start+end)/2;
            result = arr[mid];
        }

        System.out.println(result);

    }
}
