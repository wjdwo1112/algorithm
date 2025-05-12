

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import java.util.StringTokenizer;

public class Solution {
    // linkedlist 활용
    // LinkedList<타입> 리스트 이름 = new LinkedList<>();
    // 리스트 삽입 -> list.add(10) -> 끝에 10추가
    // 지정한 인덱스에 삽입 -> list.add(1,20) -> 1번 인덱스(두번째 위치)에 20 삽입
    // 리스트 삭제 -> list.remove(2); -> 2번 인덱스 값 삭제
    // 리스트 사이즈(크기) 확인 -> list.size();
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;


        for(int t=1; t<=10; t++){
            LinkedList<Integer> list = new LinkedList<>();
            int a = Integer.parseInt(bf.readLine());
            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<a; i++){

                list.add(Integer.parseInt(st.nextToken()));
            }
            int b = Integer.parseInt(bf.readLine());

            st = new StringTokenizer(bf.readLine());
            for(int i=0; i<b; i++){

                String c = st.nextToken();
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                for(int j=0; j<y; j++){
                    list.add(x+j,Integer.parseInt(st.nextToken()));
                }

            }

            System.out.print("#" + t + " ");
            for(int i=0; i<10; i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
