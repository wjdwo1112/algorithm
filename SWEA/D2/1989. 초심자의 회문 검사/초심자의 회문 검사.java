import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            String s = bf.readLine();
            int cnt = 0;
            int start = 0;
            int end = s.length()-1;
            while(start<end) {
                if (s.length() % 2 == 0) {
                    if(s.charAt(start) == s.charAt(end)){
                        cnt++;
                        start++;
                        end--;
                    }else{

                        break;
                    }
                }else{
                    if(s.charAt(start) == s.charAt(end)){
                        cnt++;
                        start++;
                        end--;
                    }else{

                        break;
                    }
                }
            }
            if(cnt == s.length()/2){
                System.out.println("#" + t + " " + 1);
            }else{
                System.out.println("#" + t + " " + 0);
            }
        }
    }
}
