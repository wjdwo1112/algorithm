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

        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        int max = sum;
        //슬라이딩 윈도우 사용 
        // k만큼 미리 더한 sum을
        // n까지 arr의 한칸 앞은 더하고 맨처음은 뺀다.
        for(int i=k; i<n; i++){
            sum += (arr[i]-arr[i-k]);
            max = Math.max(max,sum);
        }

        System.out.println(max);
        

        
    }
}