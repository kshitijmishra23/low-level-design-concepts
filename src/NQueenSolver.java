import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueenSolver {
  public ArrayList<ArrayList<String>> solveNQueens(int n) {
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    solve(n, 0, new ArrayList<Integer>(), result);
    return process(result);
  }

  private ArrayList<ArrayList<String>> process(ArrayList<ArrayList<Integer>> result) {
    ArrayList<ArrayList<String>> finalResult = new ArrayList<>();
    for (List sol : result) {
      String[][] arr = new String[result.size()][result.size()];
      System.out.println(sol + "-------");
    }

    return null;
  }

  static void solve(
      int n, int row, List<Integer> colPlacements, ArrayList<ArrayList<Integer>> result) {
    if (row == n) {
      result.add(new ArrayList<>(colPlacements));
    } else {
      for (int col = 0; col < n; col++) {
        colPlacements.add(col);
        if (isValid(colPlacements)) {
          solve(n, row + 1, colPlacements, result);
        }
        colPlacements.remove(colPlacements.size() - 1);
      }
    }
  }

  static boolean isValid(List<Integer> colPlacements) {
    int rowId = colPlacements.size() - 1;
    for (int i = 0; i < rowId; i++) {
      int diff = Math.abs(colPlacements.get(i) - colPlacements.get(rowId));
      if (diff == 0 || diff == rowId - i) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    NQueenSolver nQueenSolver = new NQueenSolver();
    ArrayList<ArrayList<String>> result = nQueenSolver.solveNQueens(4);
    System.out.println(result);
  }
}
