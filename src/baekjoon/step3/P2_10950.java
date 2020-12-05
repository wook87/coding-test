package baekjoon.step3;

import java.util.Scanner;

public class P2_10950 {

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final int count = scanner.nextInt();
    scanner.nextLine();

    final int[] arr = new int[count];
    for (int i = 0; i < count; i++) {
      final String a = scanner.nextLine();
      final String[] split = a.split(" ");
      arr[i] = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
    }

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
      if (i < arr.length - 1) {
        System.out.println();
      }
    }
  }
}
