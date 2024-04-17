import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr= new int[1000001];
        
        
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            int g = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[x] = g;
        }

        int sum = 0;
        for(int i=0; i<2*k+1 && i<arr.length; i++){
            sum += arr[i]; // 0부터 2k까지 얼음 더해주기
        }
        int max = sum;
        for(int i = 0; i+2*k+1<arr.length; i++){
            sum -= arr[i]; //앞에 있는 값 빼주고
            sum += arr[i+2*k+1]; // 뒤에 있는 값 더해준다.
            
            max = Math.max(max,sum);
        }
        System.out.println(max);
        

        
        
         
    }
}