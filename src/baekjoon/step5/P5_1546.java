package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P5_1546 {

  public static void main(String[] args) {
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      final int n = Integer.parseInt(reader.readLine());
      final StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

      double max = 0;
      final double[] arr = new double[n];
      for (int i = 0; i < n; i++) {
        arr[i] = Double.parseDouble(tokenizer.nextToken());
        max = Math.max(max, arr[i]);
      }

      double total = 0;
      for (double digit : arr) {
        total = total + (digit / max) * 100;
      }
      System.out.print(total / n);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

