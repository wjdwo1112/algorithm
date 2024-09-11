import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        String A = st.nextToken();
        String B = st.nextToken();

        String a = "";
        String b = "";

        for(int i=2; i>=0; i--){
            a = a + A.charAt(i);
            b = b + B.charAt(i);
        }
        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        int max = 0;
        max = Math.max(a2,b2);

        System.out.println(max);


    }
}