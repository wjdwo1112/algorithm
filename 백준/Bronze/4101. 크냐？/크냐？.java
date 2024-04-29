import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(bf.readLine());
           
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0){
                break;
            }
            if(a > b){
                System.out.println("Yes");
                
            }else{
                System.out.println("No");
            }
        }
    }
}