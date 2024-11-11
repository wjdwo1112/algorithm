import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++){
            int freq = Integer.parseInt(bf.readLine());
            int[] arr = new int[100];
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for(int i=0; i<100; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int result = 0;
            for(int i=0; i<freq; i++){
                int maxIndex = 0;
                int minIndex = 0;
                for(int j=0; j<100; j++){
                    if(arr[j] > arr[maxIndex]){
                        maxIndex = j;
                    }
                    if(arr[j] < arr[minIndex]){
                        minIndex = j;
                    }
                }
                if(arr[maxIndex] - arr[minIndex] <= 1){
                    break;
                }
                arr[maxIndex]--;
                arr[minIndex]++;
            }
            int max = arr[0];
            int min = arr[0];
            for(int i=0; i<100; i++){
                max = Math.max(arr[i],max);
                min = Math.min(arr[i],min);
            }
            result = max - min;
            System.out.println("#" + t + " " + result);

        }
    }
}
