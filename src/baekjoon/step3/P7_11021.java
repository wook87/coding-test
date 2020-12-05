package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P7_11021 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final int count = Integer.parseInt(reader.readLine());

      for (int i = 1; i <= count; i++) {
        final StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        out.append(String.format("Case #%d: %d", i,
            Integer.parseInt(tokenizer.nextToken()) + Integer.parseInt(tokenizer.nextToken())));
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
