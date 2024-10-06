import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BigInteger n = new BigInteger(bf.readLine());

        BigInteger start = new BigInteger("1");
        BigInteger end = n;
        BigInteger mid;

        
        while(true){
             mid = start.add(end);
             mid = mid.divide(new BigInteger("2"));
             
             //mid*mid 와 n 비교
            //같다면 0
            //mid*mid가 크다면 1
            //mid*mid가 작다면 -1
            int result = (mid.multiply(mid).compareTo(n));
            if(result == 1){
                end = mid.subtract(new BigInteger("1"));
            } else if(result == -1){
                start = mid.add(new BigInteger("1"));
            }else{
                break;
            }
        }
        System.out.println(mid);
    }
}
