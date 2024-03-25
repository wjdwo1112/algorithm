import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[m];
        int max = 0;
        for(int i=0; i<m; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            max = Math.max(arr[i],max);
        }
        int start = 1;
        int end = max;
        int answer = 0;
        
        while(start<=end){
            int mid = start + (end - start)/2;
            int sum = 0;
            for(int i=0; i<m; i++){
                sum += arr[i]/mid;
                if(arr[i] % mid != 0){
                    sum++;
                }
            }
            if(sum > n){
                start = mid + 1;
            }else{
                answer = mid;
                end = mid - 1;
            }
                
            }
        System.out.println(answer);
            
        }
        
    }
