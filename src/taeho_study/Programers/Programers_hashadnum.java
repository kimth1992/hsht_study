package taeho_study.Programers;

public class Programers_hashadnum {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int x = 10;
    Solution43 sol = new Solution43();
    System.out.println(sol.solution(x));


  }

}

class Solution43 {
  public boolean solution(int x) {

    int temp = x;
    int number = 0;

    while(x != 0) {
      number += x %10;
      x /= 10;
    }

    if(temp % number == 0)
      return true;
    else
      return false;


  }
}