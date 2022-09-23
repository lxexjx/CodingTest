package ch03.no1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));   //입력을 빨리 받기
        StringTokenizer st = new StringTokenizer(bf.readLine());    //문자열 파싱

        int n = Integer.parseInt(st.nextToken());   //항의 갯수
        int m = Integer.parseInt(st.nextToken());   //질문이 몇개인지

        long sum[] = new long[n + 1];

        //누적 합 구하기
        st = new StringTokenizer(bf.readLine());
        for(int i=1;i<n;i++){
            sum[i] = sum[i - 1] + Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(sum[b]-sum[a-1]);
        }
    }
}
