import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int T = Integer.parseInt(bf.readLine());
        int[] arr = new int[10];
        
        double avg = 0;
        
        for(int i=0; i<T; i++){
            double sum = 0;
            st = new StringTokenizer(bf.readLine());
            for(int j=0; j<10; j++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }
            avg = sum/10;
            System.out.println("#"+ (i+1) + " " + Math.round(avg));
            
            
        }
        
    }
}