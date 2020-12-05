package baekjoon.step2;

import java.util.Scanner;

public class P5_2884 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    final int b = scanner.nextInt() - 45;

    System.out.println(b < 0 ? a == 0 ? a - 1 + 24 : a - 1 : a);
    System.out.println(b < 0 ? b + 60 : b);
  }
}