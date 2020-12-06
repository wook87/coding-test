package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1_10952 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final StringBuilder builder = new StringBuilder();
      while (true) {
        final StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        final int a = Integer.parseInt(tokenizer.nextToken());
        final int b = Integer.parseInt(tokenizer.nextToken());

        if (a == 0 && b == 0) {
          break;
        }

        builder.append(a + b).append("\n");
      }
      out.write(builder.toString());
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
