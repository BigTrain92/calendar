package study2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //입력 : 키보드로 두 수의 입력을 받는다.
        //출력 :  화면에 두 수의 합을 출력한다.

        int a,b;
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.next();
        s2 = sc.next();
        System.out.println(s1 + ", " +s2);
    }
}
