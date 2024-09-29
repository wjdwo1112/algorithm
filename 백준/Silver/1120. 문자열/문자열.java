import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //a문자열과 같은 길이의 b의 부분 문자열을 반복적으로 비교하며 최소 차이를 찾는다.
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        int result = 50;

        for(int i=0; i<=b.length()-a.length(); i++){
            int cnt = 0;
            for(int j=0; j<a.length(); j++){
                if(a.charAt(j) != b.charAt(i+j)){
                    cnt++;

                }
            }
            result = Math.min(cnt,result);
        }
        System.out.println(result);

    }
}