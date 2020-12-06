package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_8958 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

      final int n = Integer.parseInt(reader.readLine());

      final String[] arr = reader.lines()
          .limit(n)
          .toArray(String[]::new);


      for (int total = 0, score = 0, i = 0; i < arr.length; i++) {
        final char[] chars = arr[i].toCharArray();
        for (char dap : chars) {
          if (dap == 'O') {
            score++;
          } else {
            score = 0;
          }
          total += score;
        }
        System.out.println(total);
        total = 0;
        score = 0;
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
