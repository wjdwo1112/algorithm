import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //구간합 구하기
    //합 배열 공식
    //S[i] = S[i-1] + A[i];
    
    //i에서 j까지의 구간합 구하는 공식
    //S[j] - S[i-1];
    
    //ex) A[2] 부터 A[5] 까지 구하기
    // S[5] - S[1] 
    // S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5];
    // S[1] = A[0] + A[1]
    // S[5] - S[1] = A[2] + A[3] + A[4] + A[5] = A[2] 부터 A[5]까지의 합이다.
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] prefix_sum = new int[n+1]; //합 배열
        int[] arr = new int[n+1];
        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefix_sum[i] = prefix_sum[i-1] + arr[i];
        }


        for(int k=1; k<=m; k++){
            st = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(prefix_sum[j] - prefix_sum[i-1]);
        }


    }
}