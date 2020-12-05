package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P8_11022 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final int count = Integer.parseInt(reader.readLine());
      for (int i = 1; i <= count; i++) {
        final StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        final int a = Integer.parseInt(tokenizer.nextToken());
        final int b = Integer.parseInt(tokenizer.nextToken());
        out.append(String.format("Case #%d: %d + %d = %d", i, a, b, a + b));
        if (i < count) {
          out.append("\n");
        }
      }
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
