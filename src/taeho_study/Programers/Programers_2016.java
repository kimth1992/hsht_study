package taeho_study.Programers;

public class Programers_2016 {

  public static void main(String[] args) {


    int a = 5;
    int b = 24;
    Solution21 sol = new Solution21();
    System.out.println(sol.solution(a, b)); 

  }

}


class Solution21 {
  public String solution(int month, int day) {
    String answer = "";

    String[] arr = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
    int[] monthEnd =  {31 , 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int sum = 0;

    for (int i = 0 ; i < month-1 ; i++) {
      sum += monthEnd[i];
    }
    int theDay = (sum + day) %7;
    answer = arr[theDay];

    return answer;
  }
}

