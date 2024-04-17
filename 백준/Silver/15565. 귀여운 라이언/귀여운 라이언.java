import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer>list = new ArrayList<>(); // 라이언 인형 위치 저장 리스트
        int[] arr = new int[n];
        
        
        st = new StringTokenizer(bf.readLine());
        for(int i=0 ; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]==1){
                list.add(i); //라이언 인형일때
            }
        }
        if(list.size()<k){
            System.out.println(-1);
        }else{
            int result = Integer.MAX_VALUE;
            for(int i=0; i<=list.size()-k; i++){
                int start = list.get(i);
                int end = list.get(i+k-1);
                result = Math.min(result,end-start+1);
            }
            System.out.println(result);
        }
    }
}