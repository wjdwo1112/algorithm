import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(bf.readLine());
        String s = bf.readLine();
        BigInteger b = new BigInteger(bf.readLine());

        if(s.equals("*")) {
            System.out.println(a.multiply(b));
        }else{
            System.out.println(a.add(b));
        }
    }
}