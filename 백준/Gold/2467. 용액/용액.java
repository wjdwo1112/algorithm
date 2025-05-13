

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = n-1;
        long min = Long.MAX_VALUE;

        int a = 0;
        int b = 0;

        while(start < end){
            if(Math.abs(arr[start] + arr[end]) < min){
                min =  Math.abs(arr[start] + arr[end]);
                a = arr[start];
                b = arr[end];
            }
            if(arr[start] + arr[end] > 0){
                end--;
            }else if(arr[start] + arr[end] < 0){
                start++;
            }else{
                a = arr[start];
                b = arr[end];
                break;
            }
        }

        System.out.print(a + " ");
        System.out.print(b);



    }
}
