

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int m = Integer.parseInt(bf.readLine());
        int[] arr = new int[14];

        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<14; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int jun = 0;
        int sung = 0;

        int jun_stock = 0;
        int jun_money = m;

        for(int i=0; i<14; i++){
            if(jun_money >= arr[i]){
                 jun_stock += jun_money / arr[i];
                 jun_money = jun_money % arr[i];
            }

        }

        int sung_stock = 0;
        int sung_money = m;

        for(int i=3; i<14; i++){
            if(arr[i-3]>arr[i-2] && arr[i-2]>arr[i-1] && arr[i-1]>arr[i]){
                if(sung_money >= arr[i]){
                    sung_stock += sung_money / arr[i];
                    sung_money = sung_money  % arr[i];
                }
            }

            if(arr[i-3]<arr[i-2] && arr[i-2]<arr[i-1]&& arr[i-1]<arr[i]){
                if(sung_stock != 0){
                    sung_money = sung_stock * arr[i];
                    sung_stock = 0;
                }
            }
        }

        sung = sung_money + (sung_stock * arr[13]);
        jun = jun_money + (arr[13] * jun_stock);

        if(jun > sung){
            System.out.println("BNP");
        }else if(sung > jun){
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }

    }
}
