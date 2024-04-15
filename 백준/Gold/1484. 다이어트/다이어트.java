import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int g = Integer.parseInt(bf.readLine());

        long start = 1;
        long end = 2;

        boolean flag = false;
        while(end<100000){
            long previous = start*start;
            long now = end*end;
            if(now - previous == g){
                System.out.println(end);
                flag = true;
            }
            if(now - previous > g){
                start++;
            }else{
                end++;
            }
        }
        if(!flag){
            System.out.println(-1);
        }

    }
}
