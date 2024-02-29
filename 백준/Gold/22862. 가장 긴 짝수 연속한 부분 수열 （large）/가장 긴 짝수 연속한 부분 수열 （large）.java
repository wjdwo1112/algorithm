import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[s];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<s; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int cnt = 0;
        int max = 0;

        while(end < s){

            if(cnt < n){
                //홀수이면 cnt증가
                if(arr[end] % 2 == 1) {
                    cnt++;
                }
                end++;
                if(max < (end - start - cnt)){
                    max = (end - start - cnt);
                }
            }
            // cnt가 n보다 같거나 클때
            else if
             //짝수이면 수열을 증가
            (arr[end] % 2 == 0){
                    end++;
                if(max < (end - start - cnt)){
                    max = (end - start - cnt);
                }
            }else{
                //홀수이면 cnt 감소, 수열 감소
                if(arr[start] % 2 == 1){
                    cnt--;

                }
                start++;
            }
        }
        System.out.println(max);

    }
}
