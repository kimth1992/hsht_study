package taeho_study.Programers;

import java.util.Arrays;

public class Programers_Max_Min {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int n = 3;
    int m = 12;
    Solution44 sol = new Solution44();
    System.out.println(sol.solution(n, m));

  }

}

class Solution44 {
  public int[] solution(int n, int m) {
    int min = (n < m) ? n : m;
    int gcd = 0;

    for(int i = 1; i <= min; i++) {
      if(n % i == 0 && m % i == 0)
        gcd = i;
    }

    int max = 0;
    max = (n * m) / gcd;

    int[] answer = {gcd, max};
    System.out.println(Arrays.toString(answer));


    return answer;
  }
}