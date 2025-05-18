

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String n = bf.readLine();

        int[] num = new int[10];
        for(int i=0; i< n.length(); i++){
            int a = n.charAt(i) -'0';
            num[a]++;
        }

        if((num[6] + num[9]) % 2 == 0 ){
            num[6] = num[9] = (num[6]+num[9])/2;
        }else{
            num[6] = num[9] = ((num[6]+num[9])/2) + 1;
        }

        int max = 0;
        for(int i=0; i<10; i++) {
            max = Math.max(max, num[i]);

        }
        System.out.println(max);
    }
}
