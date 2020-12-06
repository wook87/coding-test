package baekjoon.step5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class P1_10818 {

  public static void main(String[] args) {
    try (
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))
    ) {
      int let = Integer.parseInt(reader.readLine());
      final int[] nums = Stream.of(reader.readLine().split(" "))
          .limit(let)
          .mapToInt(Integer::parseInt)
          .toArray();

      int max = nums[0], min = nums[0];
      for (int i = 1; i < nums.length; i++) {
        max = Math.max(nums[i], max);
        min = Math.min(nums[i], min);
      }
      System.out.printf("%d %d", min, max);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
