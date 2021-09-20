package taeho_study.Programers;

public class Programers_StringInteger {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Solution33 sol = new Solution33();
    System.out.println(sol.solution("12034"));

  }

}

class Solution33 {
  public int solution(String s) {
    int answer = 0;

    answer = Integer.parseInt(s);

    return answer;
  }
}