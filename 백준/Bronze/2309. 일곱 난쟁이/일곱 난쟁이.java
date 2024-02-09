import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(bf.readLine());
            sum +=arr[i];
        }
        Arrays.sort(arr);

        int start = 0;
        int end = 8;


        //투포인터로 품
        while(start<end){
            if(sum - arr[start] - arr[end] == 100){
                break;

            }else if(sum - arr[start] - arr[end] > 100){
                start++;

            }else if(sum - arr[start] - arr[end] < 100) {
                end--;
            }

        }
        for(int i=0; i<9; i++){
            if(i == start || i == end){
                continue;
            }
            System.out.println(arr[i]);
        }

    }
}
