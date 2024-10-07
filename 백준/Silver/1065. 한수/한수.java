import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        //등차 수열 -> 연속하는 두 항의 차가 일정한 수열.
        // 1~9는 모두 등차 수열이다.
        // 수가 하나 그 자체로 수열에 속한다.
        // 10 ~ 99 또한 각 자리수의 차가 공차이고 수 자체로 수열을 이룬다.
        // ex) 31 은 공차가 -2인 수열, 38은 공차가 5인 수열이다.
        // 100보다 작은 수와 100보다 큰 수의 케이스를 나누어 생각하면 된다.
        int cnt = 0;
        
        if(n < 100){
            cnt = n;
        } else

        {
            cnt = 99;
            for(int i=100; i<=n; i++){
                //문자열 사용
                String I = String.valueOf(i);
                int a = (int)I.charAt(0);
                int b = (int)I.charAt(1);
                int c = (int)I.charAt(2);

                //각 자리수 구해서 풀기
                //int a = i/100;
                //int b = (i/10)%10;
                //int c = i%10;
                
                if((a-b) == (b-c)){
                    cnt++;
                }
                
            }
        }
        System.out.println(cnt);
    }
}