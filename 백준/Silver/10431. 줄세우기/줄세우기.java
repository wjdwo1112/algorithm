

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 입력을 빠르게 받기 위한 BufferedReader 사용
        StringTokenizer st;
        int T = Integer.parseInt(bf.readLine()); // 테스트 케이스 개수 입력 받음

        for (int t = 1; t <= T; t++) { // 테스트 케이스 개수만큼 반복
            st = new StringTokenizer(bf.readLine()); // 한 줄을 입력받고 공백 단위로 나누기
            int a = Integer.parseInt(st.nextToken()); // 첫 번째 값은 테스트 케이스 번호 (출력용)

            int[] arr = new int[20]; // 학생 20명의 키 저장할 배열
            for (int i = 0; i < 20; i++) { // 20명의 키 입력 받기
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0; // 이동 횟수를 저장할 변수

            // **삽입 정렬(Insertion Sort) 로 이동 횟수 계산**
            for (int i = 1; i < 20; i++) { // 두 번째 학생부터 시작 (앞에서부터 정렬 유지)
                int key = arr[i]; // 현재 정렬할 학생의 키 저장
                int j = i - 1; // 비교할 이전 학생 위치

                // key보다 큰 값이 있으면 오른쪽으로 밀기
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j]; // 오른쪽으로 이동
                    j--; // 한 칸 더 왼쪽으로 이동해서 비교 계속 진행
                    count++; // 이동 횟수 증가
                }
                arr[j + 1] = key; // 올바른 위치에 key 삽입
            }

            System.out.println(a + " " + count); // 테스트 케이스 번호와 이동 횟수 출력
        }
    }
}
