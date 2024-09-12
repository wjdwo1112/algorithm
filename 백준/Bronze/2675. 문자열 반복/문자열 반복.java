import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            String word = "";
            for(int j=0; j<S.length(); j++){
                char c = S.charAt(j);

                for(int k=0; k<R; k++){
                    word = word + c;
                }

            }
            System.out.println(word);


        }
    }
}
