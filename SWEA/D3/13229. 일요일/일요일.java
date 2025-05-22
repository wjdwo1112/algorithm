

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            String s = bf.readLine();
            System.out.print("#" + t + " ");
            if(s.equals("SUN")){
                System.out.println(7);
            }else if(s.equals("SAT")){
                System.out.println(1);
            }else if(s.equals("FRI")){
                System.out.println(2);
            }else if(s.equals("THU")){
                System.out.println(3);
            }else if(s.equals("WED")){
                System.out.println(4);
            }else if(s.equals("TUE")){
                System.out.println(5);
            }else if(s.equals("MON")){
                System.out.println(6);
            }
        }
    }
}
