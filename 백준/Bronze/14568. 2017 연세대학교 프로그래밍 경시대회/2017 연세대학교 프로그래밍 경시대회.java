import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int sum = 0;
        for(int i=2; i<=n-2; i+=2){
            sum += (n-i-2)/2;
        }
        System.out.println(sum);

    }
}
