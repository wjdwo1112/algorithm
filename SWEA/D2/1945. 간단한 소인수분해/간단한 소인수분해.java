import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int n = Integer.parseInt(bf.readLine());

            int[] arr = {2,3,5,7,11};
            int[] result = new int[5];


                for(int i=0; i<5; i++){
                    while(n % arr[i] == 0){
                        n = n / arr[i];
                        result[i]++;
                    }
                }

            System.out.print("#" + t + " ");
            for(int i=0; i<5; i++){

                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
