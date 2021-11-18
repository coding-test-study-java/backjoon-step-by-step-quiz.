import java.io.*;
import java.util.Scanner;

public class CodingTestMain {
    public static void main1(String[] args) {
        // 백준 2588 문제
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        String b = input.next();
        int tmp = 0;
        int result = 0;
        int digits = 1;
        int count = 0;

        input.close();

        for (int i = b.length() - 1; i >= 0; i--) {

            if (count == 1) {
                digits = 10;
            } else if (count == 2) {
                digits = 100;
            }
            tmp = (a * (b.charAt(i) - '0'));
            System.out.println(tmp);
            tmp *= digits;
            result += tmp;

            count += 1;
        }

        System.out.println(result);
    } // 백준 2588 문제 main 끝

    public static void main2(String[] args) throws IOException {
        // 백준 1330번 두 수 비교하기 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a > b) {
            bw.write(">");
        } else if (a < b) {
            bw.write("<");
        } else if (a == b) {
            bw.write("==");
        }

        bw.flush();
        bw.close();

    } // 백준 1330번 두 수 비교하기 끝

    public static void main3(String[] args) throws IOException {
        // 백준 9488번 시험 성적 문제

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int score = Integer.parseInt(br.readLine());

        bw.write(score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? "D" : "F");
        bw.flush();
        bw.close();

    } // 백준 9488번 시험 성적 문제 끝

    public static void main4(String[] args) {
        // 백준 2753 윤년 문제
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    } // 백준 2753 윤년 문제 끝

    public static void main(String[] args) {
        // 14681 사분면 고르기 문제
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else {
            System.out.println("4");
        }
    }
} // class 끝
