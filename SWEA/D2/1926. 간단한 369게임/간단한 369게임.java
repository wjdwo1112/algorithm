import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        for(int i=1; i<=N; i++){
            String tmp = String.valueOf(i);
            if(tmp.contains("3") || tmp.contains("6") || tmp.contains("9")){
                for(int j=0; j<tmp.length(); j++){
                    if(tmp.charAt(j) == '3' || tmp.charAt(j) == '6' || tmp.charAt(j) == '9'){
                        System.out.print("-");
                    }
                   
                }
                System.out.print(" ");
            }else{
                System.out.print(i + " ");
            }
            
        }
        
        
    }
}