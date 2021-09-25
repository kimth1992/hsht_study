package taeho_study.Programers;

public class Programers_root {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int n = 3;
    Solution45 sol= new Solution45();
    System.out.println(sol.solution(n));
  }

}

class Solution45 {
  public long solution(long n) {
    long answer = 0;

    for(int i = 1 ; i <= n; i++) {
      if(i == Math.sqrt(n)) {
        answer = i + 1;
        answer = answer * answer;
        return answer;
      }
    }

    return -1;
  }
}