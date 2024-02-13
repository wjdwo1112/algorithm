import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int answer = 0;

        for(int i=0; i<=K; i++) {
            int n = N-i; //여학생 쪽에서 뺴기 -> n은 인턴십 가고 남은 여학생수
            int m  = M-(K-i); //남학생 쪽에서 뺴기 -> m은 인턴십 가고 남은 남학생수
            int result = Math.min(n/2, m);// 만들 수 있는 팀의 개수 구하기
            answer = Math.max(answer, result);
        }
        System.out.println(answer);
    }

}