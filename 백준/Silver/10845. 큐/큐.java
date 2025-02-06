

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] q;
    public static int front = 0;
    public static int rear = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(bf.readLine());
        q = new int[n];
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

                case "front":
                    sb.append(front()).append("\n");
                    break;

                case "back":
                    sb.append(back()).append("\n");
            }
        }
        System.out.println(sb);

    }

    public static void push(int num){
        q[rear] = num;
        rear++;
    }

    public static int pop(){
        if(rear == front){
            return -1;
        }else{
            int a = q[front];
            front++;
            return a;
        }
    }

    public static int size(){
        return rear - front;
    }

    public static int empty(){
        if(rear == front){
            return 1;
        }else{
            return 0;
        }
    }

    public static int front(){
        if(rear == front){
            return -1;
        }else{
            int a = q[front];
            return a;
        }
    }

    public static int back(){
        if(rear == front){
            return -1;
        }else{
            int a = q[rear - 1];
            return a;
        }
    }
}
