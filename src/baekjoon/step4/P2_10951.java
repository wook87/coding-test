package baekjoon.step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P2_10951 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final StringBuilder builder = new StringBuilder();
      String line;

      while ((line = reader.readLine()) != null) {
        final StringTokenizer tokenizer = new StringTokenizer(line);
        final int a = Integer.parseInt(tokenizer.nextToken());
        final int b = Integer.parseInt(tokenizer.nextToken());

        builder.append(a + b).append("\n");
      }
      out.write(builder.toString());
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
