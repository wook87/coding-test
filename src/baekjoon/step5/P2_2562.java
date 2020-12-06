package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_2562 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final int[] arr = reader.lines()
          .limit(9)
          .mapToInt(Integer::parseInt)
          .toArray();

      int index = 0, max = arr[0];
      for (int i = 0; i < arr.length; i++) {
        if (max < arr[i]) {
          max = arr[i];
          index = i;
        }
      }
      System.out.printf("%d\n%d", max, index + 1);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
