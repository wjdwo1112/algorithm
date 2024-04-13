import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<5;i++){
            int a=s.nextInt();
            if(n==a) count++;

        }
        System.out.print(count); 


    }
}