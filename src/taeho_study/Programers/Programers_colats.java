package taeho_study.Programers;

public class Programers_colats {

  public static void main(String[] args) {


    int n = 626331;
    Solution40 sol = new Solution40();
    System.out.println(sol.solution(n));

  }

}


class Solution40 {
  public long solution(long num) {
    long answer = 0;

    while(num != 1) {
      if(num % 2 == 0) {
        num /=2;
        answer++;
      } else {
        num = num * 3 +1;
        answer++;
      }

      if(answer > 500)
        return -1;
    }





    return answer;
  }
}