import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m<=2){
            System.out.println("NEWBIE!");
        }else if(m>2 && n>=m){
            System.out.println("OLDBIE!");
        }else{
            System.out.println("TLE!");
        }
    }
}
