package lect12b.recursiveclass;

public class Main {
  public static void main(String[] args) {
    int[] nums = {7, 6, 5, 4, 3, 2, 1};
    for (int n : nums) {
      System.out.printf("Computing %d!%n", n);
      Fact f = Fact.get(n);
      System.out.printf("  %s%n", f);      
    }
  }
}
