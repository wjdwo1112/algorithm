import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    long []arr = new long[n];
    long max = 0;
    for(int i=0; i<n; i++){
        arr[i] = Long.parseLong(bf.readLine());
        max = Math.max(max,arr[i]);
    }

    long start = 1;
    long end = max;   //입력받은 막걸리중 최대 용량

    while(start <= end){
        long mid = start + (end-start)/2;
        long result = 0;
        for(int i=0; i<n; i++){
            result += (long)arr[i] / mid;   // 막걸리를 mid로 나누고 result에 더해준다.
        }
        if(result >= k){ //result 값이 나눠줄 사람보다 많으면
            start = mid + 1; // 막걸리 용량(mid값)을 늘려야 하기 때문에 하한선을 올려준다.
        }else{         //result 값이 나눠줄 사람보다 적으면
            end = mid - 1; // 막걸리 용량(mid값)을 줄여야 하기 때문에 상한선을 낮춰준다.
        }

    }
    System.out.println(end);
    }
}
