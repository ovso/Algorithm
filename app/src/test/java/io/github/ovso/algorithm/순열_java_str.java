package io.github.ovso.algorithm;

import org.junit.Test;

public class 순열_java_str {
  @Test
  public void main() {
    char[] chars = {'a', 'b', 'c', 'd'};
    permutation(chars, 0, 4);
  }

  void permutation(char[] chars, int depth, int r) {
    if (depth == r) {
      for (int i = 0; i < r; i++) {
        System.out.print(chars[i] + "\t");
      }
      System.out.println();
      return;
    }

    for (int i = depth; i < chars.length; i++) {
      char tmp = chars[depth];
      chars[depth] = chars[i];
      chars[i] = tmp;

      permutation(chars, depth + 1, r);

      // 스왑한거 다시 되돌리기
      chars[i] = chars[depth];
      chars[depth] = tmp;
    }
  }
}
