import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(bf.readLine());
        for (int i = 1; i <= 3; i++) {
            total += Integer.parseInt(bf.readLine());
        }
        System.out.print(total/60 + "\n" + total % 60);
    }
}