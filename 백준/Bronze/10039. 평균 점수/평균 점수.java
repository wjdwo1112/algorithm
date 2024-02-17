import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int sum = 0;

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            if(arr[i]<40) {
                sum += 40;
            }else{
                sum += arr[i];
            }
        }
        int avg = sum/5;
        System.out.println(avg);
    }

}