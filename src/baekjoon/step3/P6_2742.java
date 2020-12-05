package baekjoon.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class P6_2742 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out))
    ) {
      final int a = Integer.parseInt(reader.readLine());
      for (int i = a; i >= 1; i--) {
        out.append(String.valueOf(i));
        if (i > 1) {
          out.append("\n");
        }
      }
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
