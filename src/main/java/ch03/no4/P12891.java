package ch03.no4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891 {

    static int[] mustArr;   // 꼭 있어야 할 서열
    static int[] myArr;     //내가 가지고 있는 서열
    static int check;       //위 두개 비교해서 확인


    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int X = Integer.parseInt(st.nextToken());   //전제 배열의 크기
        int Y = Integer.parseInt(st.nextToken());   //내 배열의 크기

        int result = 0;

        char[] A = new char[X];     //전체 배열 입력
        mustArr = new int[4];       //꼭 있어야 할 서열
        myArr = new int[4];         //내가 가지고 있는 서열
        check = 0;

        A = bf.readLine().toCharArray();    //전체 문자열을 배열로 만들어주고

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < 4; i++) {
            mustArr[i] = Integer.parseInt(st.nextToken());
            if (mustArr[i] == 0) {
                check++;
            }
        }

        for(int i=0;i<Y;i++){
            Add(A[i]);
        }

        if(check==4){
            result++;
        }

        for(int i=Y; i<X;i++){
            int j=i-Y;
            Add(A[i]);
            Remove(A[j]);
            if(check==4){
                result++;
            }

            System.out.println(result);
            bf.close();
        }
    }

    //새로 들어오는 문자 처리
    private static void Add(char c){
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == mustArr[0]) {
                    check++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == mustArr[1]) {
                    check++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == mustArr[2]) {
                    check++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == mustArr[3]) {
                    check++;
                }
                break;
        }
    }

    //제거되는 문자 처리
    private static void Remove(char c){
        switch (c) {
            case 'A':
                myArr[0]--;
                if (myArr[0] == mustArr[0]) {
                    check--;
                }
                break;
            case 'C':
                myArr[1]--;
                if (myArr[1] == mustArr[1]) {
                    check--;
                }
                break;
            case 'G':
                myArr[2]--;
                if (myArr[2] == mustArr[2]) {
                    check--;
                }
                break;
            case 'T':
                myArr[3]--;
                if (myArr[3] == mustArr[3]) {
                    check--;
                }
                break;
        }
    }

}
