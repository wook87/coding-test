package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3_1110 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ) {
      final int num = Integer.parseInt(reader.readLine());
      int newNum = num;
      int count = 0;
      do {
        final int quotient = newNum / 10;
        final int remainder = newNum % 10;
        newNum = (remainder * 10) + (quotient + remainder) % 10;
        count++;
      } while (newNum != num);
      System.out.println(count);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
