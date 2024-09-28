import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        //주어진 무게 정렬 후
        //제일 낮은 갑부터 총 로프의 개수를 곱해준다.
        //한단계 높은 로프를 계산할떄는 로프의 개수에서 1씩 뺴준다.
        //최대값 출력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(arr);

        int[] total = new int[n+1];
        int max = 0;
        int k = n;
        for(int i=1; i<=n; i++){
            total[i] = k * arr[i];
            k--;
            max = Math.max(max,total[i]);
        }
        System.out.println(max);
    }
}
