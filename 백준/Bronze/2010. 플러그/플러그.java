import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(bf.readLine());
        }
        total -= (n-1);
        System.out.print(total);
    }
}