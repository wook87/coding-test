package baekjoon.step1;

import java.util.Scanner;

public class P11_2588 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int a = Integer.parseInt(scanner.nextLine());
    final char[] b = scanner.nextLine().toCharArray();

    int sum = 0;
    int count = 0;
    for (int i = b.length - 1; i >= 0; i--, count++) {
      final int bNum = Character.getNumericValue(b[i]);
      final int multiply = bNum * a;
      System.out.println(multiply);
      sum += multiply * (int) Math.pow(10, count);
    }
    System.out.println(sum);
  }
}
