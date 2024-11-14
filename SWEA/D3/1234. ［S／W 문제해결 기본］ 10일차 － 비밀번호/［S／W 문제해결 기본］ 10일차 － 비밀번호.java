import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            for(int t=1; t<=10; t++) {
                StringTokenizer st = new StringTokenizer(bf.readLine());
                int n = Integer.parseInt(st.nextToken());
                String s = st.nextToken();
                //스택을 사용하여 연속된 쌍을 제거
                Stack<Integer>stack = new Stack<>();
                int top = 0;

                for (int i = 0; i < n; i++){
                    int a = s.charAt(i) - '0';

                    //스택이 비어있지 않고, 스택의 맨위 문자가 현재 문자와 같으면 제거
                    if(!stack.isEmpty() && stack.peek() == a){
                        stack.pop(); //스택의 맨 위 문자 제거

                    }else{
                        stack.push(a); // 같지 않으면 현재 문자 추가
                    }


                }
                //스택에 남은 문자들을 문자열로 변환하여 출력
                System.out.print("#" + t + " ");
                for(int i=0; i<stack.size(); i++){
                    System.out.print(stack.get(i)); //get으로 index 접근
                }
                System.out.println();

            }


    }
}
