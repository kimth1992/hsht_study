package taeho_study.Programers;

public class Programers_divisorSum {

  public static void main(String[] args) {

    int n = 12;
    Solution51 sol = new Solution51();
    System.out.println(sol.solution(n));

  }

}


class Solution51 {
  public int solution(int n) {
    int answer = 0;

    for(int i = 1; i <= n; i++) {
      if(n%i == 0) {
        answer += i;
      }
    }
    return answer;
  }
}