package baekjoon.step2;

import java.util.Scanner;

public class P2_9498 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();

    if (a >= 90 && a <= 100) {
      System.out.println("A");
    } else if (a >= 80 && a < 90) {
      System.out.println("B");
    } else if (a >= 70 && a < 80) {
      System.out.println("C");
    } else if (a >= 60 && a < 70) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }
  }
}
