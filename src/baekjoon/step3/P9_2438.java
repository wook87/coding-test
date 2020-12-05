package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P9_2438 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final int count = Integer.parseInt(reader.readLine());
      String star = "";
      for (int i = 0; i < count; i++) {
        star += "*";
        out.append(star);
        if (i < count - 1) {
          out.append("\n");
        }
      }
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
