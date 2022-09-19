package simpleex;

import java.util.Scanner;

public class ex02_01 {

       static int MaxHeight(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max) {
               a[i]=max;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       // System.out.println(num);

        int[] height=new int[num];
        for(int i=0;i<num;i++){
            System.out.println("height["+i+"]");
            height[i] = sc.nextInt();
        }
        System.out.println(MaxHeight(height));
    }

}

