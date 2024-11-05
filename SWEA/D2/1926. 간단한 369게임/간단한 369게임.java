import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int i = 1;

        while(i <= n){
            
            String I = String.valueOf(i);
            if(I.contains("3") || I.contains("6") || I.contains("9")){
                for(int j=0; j<I.length(); j++){
                    if(I.charAt(j) == '3' || I.charAt(j) == '6' ||I.charAt(j) == '9'){
                        System.out.print('-');
                    }
                }
            }else{
                System.out.print(I);
            }
            System.out.print(" ");
            i++;
        }
    }
}