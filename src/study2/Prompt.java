package study2;

import java.util.Scanner;

public class Prompt {

    private final static String PROMPT = "cal> ";

    private void runPrompt() {
        Scanner sc = new Scanner(System.in);
        Calendar cal = new Calendar();

        int month = 1;
        int year = 1;

        while (true) {
            System.out.println("년도를 입력하세요");
            System.out.print("YEAR> ");
            year = sc.nextInt();
            System.out.println("월을 입력하세요");
            System.out.print("MONTH> ");
            month = sc.nextInt();

            if (month == -1) {
                break;
            }

            if (month > 12) {
                continue;
            }

            cal.printCaledar(year, month);
        }

        System.out.println("끝내기");
        sc.close();
    }

    public static void main(String[] args) {
        //셀 실행
        Prompt p = new Prompt();
        p.runPrompt();

    }
}
