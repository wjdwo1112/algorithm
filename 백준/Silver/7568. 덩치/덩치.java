import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());

        }
        
        for(int i=0 ; i<n; i++){
            int k = 1;
            for(int j=0; j<n; j++){
               if(i==j){
                   continue;
               }
                if(x[i]<x[j] && y[i]<y[j]){
                    k++;
                    
                    
                }
            }
            System.out.print(k + " ");
        
            
        }
    }
    }