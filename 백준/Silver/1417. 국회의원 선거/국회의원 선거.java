import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int dasom = Integer.parseInt(bf.readLine());
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(bf.readLine());
        }
       int cnt = 0;
        if(n==1){
            System.out.println(0);
            return;
        }
        while(true){
            Arrays.sort(arr);
            boolean flag = true;
            int last = arr.length-1;
            if(dasom<=arr[last]){
                dasom++;
                arr[last]--;
                cnt++;
                flag = false;
            }
            if(flag){
                break;
            }
            
        }
        System.out.println(cnt);
        
        
    }
}