import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int len = s.length();
        int ans = 1;

        for(int i=0; i<len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                ans = 0;
            }
        }
        System.out.println(ans);

    }
}
