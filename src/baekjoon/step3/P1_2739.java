package baekjoon.step3;

import java.util.Scanner;

public class P1_2739 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int dan = scanner.nextInt();

    for (int i = 1; i <= 9; i++) {
      System.out.printf("%d * %d = %d", dan, i, dan * i);
      if (i < 9) {
        System.out.println();
      }
    }
  }
}
