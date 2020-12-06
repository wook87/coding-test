package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_3052 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.print(reader.lines()
          .limit(10)
          .mapToInt(Integer::parseInt)
          .map(i -> i % 42)
          .distinct()
          .count());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
