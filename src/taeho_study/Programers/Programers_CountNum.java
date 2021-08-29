package taeho_study.Programers;

public class Programers_CountNum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Solution13 sol = new Solution13();
    System.out.println(sol.solution(987));

  }

}

class Solution13 {
  public int solution(int n) {
    int answer = 0;


    while(n != 0) {
      answer += n%10;
      n /= 10;
    }

    return answer;
  }
}
