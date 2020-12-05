package baekjoon.step2;

import java.util.Scanner;

public class P1_1330 {

  public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();

    System.out.println(a > b ? ">" : a < b ? "<" : "==");
  }
}
