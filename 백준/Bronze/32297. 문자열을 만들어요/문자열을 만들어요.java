import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String s = bf.readLine();

        if(s.contains("gori")){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
