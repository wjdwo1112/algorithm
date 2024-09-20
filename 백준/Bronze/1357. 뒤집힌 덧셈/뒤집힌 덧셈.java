import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        String x = st.nextToken();
        String y = st.nextToken();

        String revx = "";
        String revy = "";

        for(int i=x.length()-1; i>=0; i--){
            char c = x.charAt(i);
            revx = revx + c;
        }
        for(int i=y.length()-1; i>=0; i--){
            char c = y.charAt(i);
            revy = revy + c;
        }
        int a = Integer.parseInt(revx);
        int b = Integer.parseInt(revy);

        String d = Integer.toString(a+b);
        String e = "";
        for(int i=d.length()-1; i>=0; i--){
            char c =d.charAt(i);


            e = e + c;
        }
        int f = Integer.parseInt(e);
        System.out.println(f);



    }
}
