package taeho_study.Programers;

public class Programers_low {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] arr = {3,2,4,1,1,7};

    Solution15 sol = new Solution15();
    sol.solution(arr);

  }

}



class Solution15 {
  public int[] solution(int[] arr) {

    if(arr.length == 1) 
      return new int[]{-1};

    int j = 0; // 가장 작은 인덱스
    for(int i = 0 ; i < arr.length ; i++) {
      if(arr[j] > arr[i]) {
        j = i;
      }
    }


    int[] answer = new int[arr.length -1];

    int cnt = 0;
    for(int i = 0 ; i < arr.length ; i++) {
      if(i == j)
        continue;
      answer[cnt] = arr[i];
      cnt++;
    }

    return answer;
  }
}