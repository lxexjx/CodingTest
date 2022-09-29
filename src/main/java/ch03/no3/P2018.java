package ch03.no3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class P2018 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N= sc.nextInt();
        int count = 1;
        int start = 1;
        int end = 1;
        int sum = 1;

        while(end!=N){
            if(sum==N){
                count++;
                end++;
                sum=sum+end;
            }else if(sum>N){
                sum=sum-start;
                start++;
            }else {
                end++;
                sum=sum+end;
            }
        }
        System.out.println(count);
    }
}
