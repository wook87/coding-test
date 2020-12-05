package baekjoon.step2;

import java.util.Scanner;

public class P4_14681 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();

    if (a > 0) {
      if (b > 0) {
        System.out.println(1);
      } else {
        System.out.println(4);
      }
    } else {
      if (b > 0) {
        System.out.println(2);
      } else {
        System.out.println(3);
      }
    }
  }
}
