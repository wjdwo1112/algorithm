import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static  int[] stack;
    public static int size = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        stack = new int[n];
        for(int i=0; i<n; i++){
            st = new StringTokenizer(bf.readLine());
            String s = st.nextToken();

            switch(s){
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n");
            }

        }
        System.out.println(sb);
    }

    public static void push(int num){
        stack[size] = num;
        size++;
    }

    public static int pop(){
        if(size == 0){
            return -1;
        }else{
            int a = stack[size - 1];
            size--;
            return a;
        }
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if(size == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static int top(){
        if(size == 0){
            return -1;
        }else{
            return stack[size - 1];
        }
    }
}
