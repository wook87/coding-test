package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P10_2439 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final int count = Integer.parseInt(reader.readLine());
      final StringBuilder star = new StringBuilder();
      for (int i = 1; i <= count; i++) {
        final StringBuilder space = new StringBuilder();
        for (int j = count - i; j > 0; j--) {
          space.append(" ");
        }
        out.append(space.toString());
        star.append("*");
        out.append(star.toString());
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
