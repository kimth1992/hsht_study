package taeho_study.Programers;

import java.util.Arrays;

public class Programers_arr1_arr2_add {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[][] arr1 = {{1,2}};
    int[][] arr2 = {{3,4}};
    Solution41 sol = new Solution41();
    System.out.println(sol.solution(arr1, arr2));

  }

}


class Solution41 {
  public int[][] solution(int[][] arr1, int[][] arr2) {
    int[][] answer = new int[arr1.length][arr1[0].length];

    for(int i = 0; i < arr1.length; i++) {
      for(int j =0; j < arr1[0].length; j++) {
        answer[i][j] = arr1[i][j] + arr2[i][j];
      }
    }

    System.out.println(Arrays.deepToString(answer));



    return answer;
  }
}