package taeho_study.Programers;

import java.util.Arrays;

public class Programers_downtodown {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int n = 118372;
    // 873211
    Solution46 sol = new Solution46();
    System.out.println(sol.solution(n));

  }

}


class Solution46 {
  public long solution(long n) {
    long answer = 0;

    String num = n + "";

    char[] arr = new char[num.length()];

    for(int i = 0; i < num.length(); i++) {
      arr[i] = num.charAt(i);
    }

    Arrays.parallelSort(arr);
    String s = "";
    for(int i = 0; i < arr.length; i++) {
      s += arr[i];
    }

    System.out.println(s);
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();

    String kk = sb.toString();
    System.out.println(kk);

    answer = Long.parseLong(kk);

    return answer;
  }
}


