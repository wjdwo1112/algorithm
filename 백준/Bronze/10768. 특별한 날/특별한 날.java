import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        if(a<2){
            System.out.println("Before");

        }else if(a==2 && b<18){
            System.out.println("Before");
        }else if(a==2 && b==18){
            System.out.println("Special");
        } else {
            System.out.println("After");

        }
    }
}