import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        int size = 0;
        for(int i=0; i<k; i++){
            int a = Integer.parseInt(bf.readLine());
            if(a == 0){
                stack.pop();
                continue;
            }
            stack.push(a);

        }
        int sum = 0;
        for(int i=0; i<stack.size(); i++){
            sum += stack.get(i);
        }
        System.out.println(sum);

    }
}
