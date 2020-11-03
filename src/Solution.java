import java.util.*;
public class Solution {

  // Returns true if str[curr] does not matches with any of the
// characters after str[start]
  static boolean shouldSwap(char str[], int start, int curr) {
    for (int i = start; i < curr; i++) {
      if (str[i] == str[curr]) {
        return false;
      }
    }
    return true;
  }

  // Prints all distinct permutations in str[0..n-1]
  static void findPermutations(char str[], int index, int n) {
    if (index >= n) {
      System.out.println(str);
      return;
    }

    for (int i = index; i < n; i++) {

      // Proceed further for str[i] only if it
      // doesn't match with any of the characters
      // after str[index]
      boolean check = shouldSwap(str, index, i);
      if (check) {
        swap(str, index, i);
        findPermutations(str, index + 1, n);
        swap(str, index, i);
      }
    }
  }

  static void swap(char[] str, int i, int j) {
    char c = str[i];
    str[i] = str[j];
    str[j] = c;
  }

  // Driver code
  public static void main(String[] args) {

    char str[] = {'A', 'B', 'C', 'A'};
    int n = str.length;
    findPermutations(str, 0, n);
  }

}

