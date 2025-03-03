

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] arr = new int[n-1];
        int dasom = Integer.parseInt(bf.readLine());
        for(int i=0; i<n-1; i++){
            arr[i] = Integer.parseInt(bf.readLine());

        }
        int count = 0;


        if(n==1){
            System.out.println(0);
            return;
        }

        while(true){
            Arrays.sort(arr);
            if(dasom > arr[n-2]){
                break;
            }
            dasom++;
            arr[n-2]--;
            count++;
        }
        System.out.println(count);
    }
}
