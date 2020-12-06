package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P7_4344 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final int n = Integer.parseInt(reader.readLine());
      final String[] arr = reader.lines()
          .limit(n)
          .toArray(String[]::new);

      for (String a : arr) {
        final StringTokenizer tokenizer = new StringTokenizer(a);
        final int let = Integer.parseInt(tokenizer.nextToken());

        final double[] cases = new double[let];
        int sum = 0;
        for (int i = 0; i < let; i++) {
          final double digit = Double.parseDouble(tokenizer.nextToken());
          sum += digit;
          cases[i] = digit;
        }

        int p = 0;
        final double average = (double) sum / let;
        for (double digit : cases) {
          if (digit > average) {
            p++;
          }
        }
        System.out.printf("%.3f%s\n", (double) p / let * 100, "%");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
