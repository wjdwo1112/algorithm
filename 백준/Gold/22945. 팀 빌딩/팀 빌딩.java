import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.min;
import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
    int[] arr = new int[n];
    StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
    for(int i=0; i<n; i++){
        arr[i] = Integer.parseInt(stringTokenizer.nextToken());
    }

    int start =0;
    int end = n-1;
    int result = 0;
    //int sum = min(arr[start],arr[end])*cnt;

    while(true){
        result =max(result,((end-start-1) * min(arr[start],arr[end])));
        if(end-start-1 == 0){
            break;
        }
        if(arr[start] < arr[end] ){
            start++;

        }else if(arr[start]>arr[end]){
            end--;

        }else{
            if(arr[start+1]>arr[end-1]){
                end --;
            }else{
                start++;
            }
        }


    }
    System.out.println(result);
    }
}
