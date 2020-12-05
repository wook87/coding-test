package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P11_10871 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {

      StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
      final int n = Integer.parseInt(tokenizer.nextToken());
      final int x = Integer.parseInt(tokenizer.nextToken());

      tokenizer = new StringTokenizer(reader.readLine());
      final StringBuilder builder = new StringBuilder();
      for (int i = 0; i < n; i++) {
        int number = Integer.parseInt(tokenizer.nextToken());
        if (number < x) {
          builder.append(number).append(" ");
        }
      }
      out.write(builder.toString());
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
