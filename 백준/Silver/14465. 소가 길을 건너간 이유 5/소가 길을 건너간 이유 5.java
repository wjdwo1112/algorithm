import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[100001];
        for(int i=0; i<b;i++){
            int a = Integer.parseInt(bf.readLine());
            arr[a] = 1;
        }
        int cnt = 0;
        // 시작 부터 k까지 고쳐야 하는 신호등이 몇개인지 세는 작업
        for(int i=1; i<=k ; i++) {
            if (arr[i] == 1) {
                cnt++;
            }
        }
        int min = cnt;
        for(int i=1; i+k-1<n; i++){

            //만약 고장난 신호등이면 cnt 감소
            if(arr[i] == 1){
                cnt--;
            }
            //고장난 신호등이 아니면 cnt 증가
            if(arr[i+k] == 1){
                cnt++;
            }

            if(min > cnt){
                min = cnt;
            }
        }
        System.out.println(min);
    }
}
