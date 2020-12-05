package baekjoon.step3;

import java.util.Scanner;

public class P3_8393 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();

    int sum = 0;
    for (int i = 1; i <= a; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}
