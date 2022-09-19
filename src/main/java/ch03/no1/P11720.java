package ch03.no1;

import java.util.Scanner;

public class P11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String m = sc.next();

        char[] array = m.toCharArray();

        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum += array[i] - '0';
        }
        System.out.println(sum);
    }
}
