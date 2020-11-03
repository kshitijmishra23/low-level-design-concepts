import java.util.ArrayList;
import java.util.Arrays;

public class UniquePermutation {
  static ArrayList<ArrayList<Integer>> result;

  public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
    result = new ArrayList<>();
    findPermutations(A, 0, A.size());
    return result;
  }

  static void findPermutations(ArrayList<Integer> arr, int index, int n) {
    if (index >= n) {
      result.add(new ArrayList<>(arr));
      return;
    }

    for (int i = index; i < n; i++) {
      boolean check = canSwap(arr, index, i);
      if (check) {
        swap(arr, index, i);
        findPermutations(arr, index + 1, n);
        swap(arr, index, i);
      }
    }
  }

  static void swap(ArrayList<Integer> arr, int i, int j) {
    int x = arr.get(i);
    arr.set(i, arr.get(j));
    arr.set(j, x);
  }

  static boolean canSwap(ArrayList<Integer> arr, int start, int curr) {
    for (int i = start; i < curr; i++) {
      if (arr.get(i) == arr.get(curr)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    UniquePermutation uniquePermutation = new UniquePermutation();
    System.out.println(uniquePermutation.permute(new ArrayList<>(Arrays.asList(1, 1, 2))));
  }
}
