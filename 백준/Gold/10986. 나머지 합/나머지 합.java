import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 합 배열에서 나머지 연산한 값이 0이라면 0부터 i까지의 합이 0으로 나누어 떨어진다는 뜻이다.
    //
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        long[] arr = new long[n+1];
        long[] prefix = new long[n+1]; //누적 합 배열
        long[] count = new long[m]; // 나머지 연산한 값들 중 같은 게 있으면 넣을 배열
        int remainder = 0; // 나머지 연산 한 값
        long cnt = 0;

        st = new StringTokenizer(bf.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=1; i<=n; i++){
            remainder = (int)(prefix[i] % m);
            if(remainder == 0){
                cnt++; // 나머지 연산한 값이 0이면 카운트를 올린다.

            }
            count[remainder]++; // 나머지 연산값 / ex) 0이면 0이 몇개, 1이면 1이 몇개
                                // 나머지 연산값이 같은 인덱스의 개수를 센다
        }

        for(int i=0; i<m; i++){
            if(count[i] > 1){
                //만약 나머지 연산값이 같은 인덱스 중에서 2개를 뽑는 경우의 수를 더하기 ex) 3c2 , 2c2
                cnt = cnt + (count[i] * (count[i] - 1) / 2);
            }
        }
        System.out.println(cnt);



    }
}
