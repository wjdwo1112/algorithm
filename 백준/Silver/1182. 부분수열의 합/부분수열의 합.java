import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int n;
    public static int s;
    public static int[]arr;
    public static int answer = 0;
    
    
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        recur(0,0);
        if(s==0){
            answer--;
            System.out.println(answer);
        }else{
            System.out.println(answer);
        }
    }

    public static void recur(int cur, int sum){
        if(cur == n){
            if(sum == s){
                answer++;
            }
            return;
        }
        recur(cur+1 , sum+arr[cur]);
        recur(cur+1, sum);
    }
}