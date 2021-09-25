package taeho_study.Programers;

import java.util.Arrays;

public class Programers_x_n_list {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int x = -4;
    int n = 3;
    Solution42 sol = new Solution42();
    System.out.println(sol.solution(x, n));

  }

}

class Solution42 {
  public long[] solution(long x, long n) {
    long[] answer = new long[(int)n];


    for(int i = 0; i < n; i++) {
      answer[i] = x * (i+1);
    }

    System.out.println(Arrays.toString(answer));


    return answer;
  }
}