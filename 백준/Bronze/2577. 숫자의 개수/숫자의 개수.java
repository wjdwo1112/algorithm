

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        int time = a * b * c;
        String con = String.valueOf(time);
        int[] arr = new int[10];
        for(int i=0; i<con.length(); i++){
            int k = con.charAt(i) - '0';
            arr[k]++;
        }

        for(int i=0; i<10; i++){
            System.out.println(arr[i]);
        }


    }
}
