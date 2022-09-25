package ch03.no2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   //빨리 입력 받기 위해
        StringTokenizer st = new StringTokenizer(bf.readLine());    //입력값 자르기 위해

        int n = Integer.parseInt(st.nextToken());   //어느 크기의 정사각 표 입력
        int m = Integer.parseInt(st.nextToken());   //질문의 갯수 입력

        //정사각 표 값 입력하기
        int map[][]=new int[n+1][n+1];      //정사각 표
        for(int i=1;i<=n;i++){   //표 입력 받기
            st = new StringTokenizer(bf.readLine());
            for(int j=1;j<=n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //표 각 값의 원하는 위치의 합구하기
        int sum[][]=new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                sum[i][j]=sum[i][j-1]+sum[i-1][j]+map[i][j]-sum[i-1][j-1];
            }
        }

        //위치 입력 받기
        for(int i=0;i<m;i++){
            st = new StringTokenizer(bf.readLine());

            //첫번째 위치 입력 받기
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());

            //두번째 위치 입력 받기
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            //결론 도출
            int result=sum[x2][y2]-sum[x1-1][y2]-sum[x2][y1-1]+sum[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
