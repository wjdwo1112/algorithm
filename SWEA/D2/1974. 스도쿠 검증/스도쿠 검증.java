import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        for(int t=1; t<=T; t++){
            int[][] sudoku = new int[9][9];

            // 9x9 배열 입력 받기
            for(int i=0; i<9; i++){
                StringTokenizer st = new StringTokenizer(bf.readLine());
                for(int j=0; j<9; j++){
                    sudoku[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 1; //기본 결과는 1로 설정 , 중복이 발견되면 0으로 변경
            //행 검사 하기
            for(int i=0; i<9; i++){ //i는 행의 의미
                int[] rowCheck = new int[10]; // 각 행마다 1~9 숫자 중복 여부를 저장할 배열 생성
                for(int j=0; j<9; j++){ // j는 열을 의미
                    int num = sudoku[i][j]; // 현재 검사할 숫자를 가져옴
                    if(rowCheck[num] == 1){ //해당 숫자가 이미 등장한 경우
                        result = 0; // 중복이므로 유효하지 않음을 표시
                        break; //반복문 탈출
                    }
                    rowCheck[num] = 1; //해당 숫자를 rowCheck에 기록하여 중복되지 않도록 설정
                }
                if(result == 0) break; //중복이 발견되면 전체 행 검사를 중지
            }

            //열 검사하기
            if(result == 1){ //중복이 발견되지 않으면 열 검사 시작
                for(int j=0; j<9; j++){ //j는 열을 나타냄
                    int[] colCheck = new int[10];
                    for(int i=0; i<9; i++){ // i는 행을 나타냄
                        int num = sudoku[i][j]; // 현재 검사할 숫자
                        if(colCheck[num] == 1){ //해당 숫자가 이미 등장한 경우
                            result = 0; //중복 발견
                            break; // 반복문 탈출
                        }
                        colCheck[num] = 1; //중복이 아니면 해당 숫자 표시
                    }
                    if(result == 0)break; // 중복이 발견되면 현재 검사 중지
                }
            }

            //3x3 검사하기
            if(result == 1){ //이전 검사에서 중복이 없을 때만 실행
                for(int i=0; i<9; i+=3){ // i는 3x3 격자의 행 시작 위치(0,3,6)
                    for(int j=0; j<9; j+=3){ // j는 3x3 격자의 열 시작 위치(0,3,6)
                        int[] gridCheck = new int[10]; //3x3 격자 내에서의 중복을 확인하는 배열
                        for(int x=0; x<3; x++){ // x는 3x3 격자 내 행의 상대적 위치
                            for(int y=0; y<3; y++){ //y는 3x3 격자 내 열의 상대적 위치
                                int num = sudoku[x+i][y+j]; // 현재 3x3 격자의 숫자
                                if(gridCheck[num] == 1){ //중복된 숫자가 발견된 경우
                                    result = 0; //중복이므로 유효하지 않음을 표시
                                    break; // 반복문 탈출
                                }
                                gridCheck[num] = 1; //숫자 등장 표시
                            }
                            if(result == 0)break; //중복이 발견되면 반복문 탈출
                        }
                        if(result == 0)break; // 중복이 발견되면 다음 격자 검사 생략
                    }
                    if(result == 0)break; //중복이 발견되면 3x3 격자 검사 종료
                }
            }

            System.out.println("#" + t + " " + result);

        }
    }
}
