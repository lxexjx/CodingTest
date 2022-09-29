package ch03.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(bf.readLine());   //재료의갯수
        int sum = Integer.parseInt(bf.readLine());  //숫자의 합
        int[] arr = new int[N];   //배열 선언

        //배열 입력
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);   //배열 오름차순 정렬

        int count = 0;
        int i = 0;
        int j = N - 1;

        while(i<j) {
            if (arr[i] + arr[j] < sum) {
                i++;
            } else if (arr[i] + arr[j] > sum) {
                j--;
            } else {
                count++;
                j--;
                i++;
            }
        }
        System.out.println(count);
        //bf.close();
    }
}
