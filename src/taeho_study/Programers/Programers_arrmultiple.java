package taeho_study.Programers;

public class Programers_arrmultiple {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] a = {-3, -1, 0, 2};
    int[] b = {1,2,3,4};

    Solution22 sol = new Solution22();
    System.out.println(sol.solution(a, b));

  }

}


class Solution22 {
  public int solution(int[] a, int[] b) {
    int answer = 0;

    int sum = 0;

    for(int i = 0; i < a.length ; i++) {
      sum = a[i] * b[i];
      answer += sum;
    }

    return answer;
  }
}