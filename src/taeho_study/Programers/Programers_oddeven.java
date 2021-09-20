package taeho_study.Programers;

public class Programers_oddeven {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int num = -5;
    Solution36 sol = new Solution36();
    System.out.println(sol.solution(num));
  }

}

class Solution36 {
  public String solution(int num) {
    String answer = "";

    num = Math.abs(num);

    if(num%2 == 0) {
      answer = "Even";
    }
    else if(num%2 ==1)
      answer = "Odd";

    return answer;

  }
}