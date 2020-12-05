package baekjoon.step1;

import java.util.Scanner;

public class P10_10430 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();
    final int c = scanner.nextInt();

    System.out.println((a + b) % c);
    System.out.println(((a % c) + (b % c)) % c);
    System.out.println((a * b) % c);
    System.out.println(((a % c) * (b % c)) % c);
  }
}
