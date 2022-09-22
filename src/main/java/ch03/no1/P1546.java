package ch03.no1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P1546 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int grade[]=new int[n];

        for(int i=0;i<n;i++){
            grade[i] = sc.nextInt();
        }
        Arrays.sort(grade);
        double sum=0;
        for(int i=0;i< grade.length;i++){
            sum+=((grade[i]/grade[grade.length-1])*100);
        }
        System.out.println(sum/n);
    }
}
