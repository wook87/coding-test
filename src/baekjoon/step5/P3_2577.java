package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P3_2577 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final int a = Integer.parseInt(reader.readLine());
      final int b = Integer.parseInt(reader.readLine());
      final int c = Integer.parseInt(reader.readLine());

      int d = a * b * c;

      int index = 0;
      int[] temp = new int[10];

      while (d > 0) {
        temp[(temp.length - 1) - index] = d % 10;
        d /= 10;
        index++;
      }

      int[] arr = new int[index];
      System.arraycopy(temp, 10 - index, arr, 0, arr.length);

      int[] digits = new int[10];
      for (final int j : arr) {
        switch (j) {
          case 0: digits[0]++;break;
          case 1: digits[1]++;break;
          case 2: digits[2]++;break;
          case 3: digits[3]++;break;
          case 4: digits[4]++;break;
          case 5: digits[5]++;break;
          case 6: digits[6]++;break;
          case 7: digits[7]++;break;
          case 8: digits[8]++;break;
          case 9: digits[9]++;break;
        }
      }
      Arrays.stream(digits).forEach(System.out::println);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
