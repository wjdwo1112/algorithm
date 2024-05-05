import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        long a = Long.parseLong(st.nextToken());
         long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        long e = Long.parseLong(st.nextToken());

        long result = (a*a + b*b + c*c + d*d + e*e)%10;
        System.out.println(result);
    }
}