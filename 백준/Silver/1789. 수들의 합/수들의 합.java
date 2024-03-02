import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(bf.readLine());
        long sum = 0;
        long cnt = 0;
        for (int i = 1; ; i++) {
            if (sum > s) {
                break;

            }
            sum += i;
            cnt++;

        }
        System.out.println(cnt - 1);
    }
}
