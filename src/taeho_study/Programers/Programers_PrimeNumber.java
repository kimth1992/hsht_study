package taeho_study.Programers;

public class Programers_PrimeNumber {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int n = 10;
    Solution37 sol = new Solution37();
    System.out.println(sol.solution(n));

  }

}

class Solution37 {
  public int solution(int num) {
    int answer = 0;

    boolean[] arr = new boolean[num+1];  
    arr[0] = arr[1] = false;
    for(int i=2; i<=num; i+=1) {
      arr[i] = true;
    }

    for(int i = 2; i*i < num ; i++) {
      for(int j = i*i; j <= num; j+=i) {
        arr[j] = false;
      }
    }

    for(int i=0; i<=num; i+=1) { 
      if(arr[i] == true) {
        answer++;
      }
    }


    return answer;


  }
}

//class Solution37 {
//  public int solution(int n) {
//    int answer = 0;
//
//
//    for (int i = 0; i < n; i++) {
//      // 만약 소수라면 answer++
//      if(isPrimeNumber(i+1))
//        answer++;
//    }
//
//
//    return answer;
//  }
//
//  boolean isPrimeNumber(int n) {
//
//    if(n == 1)
//      return false;
//
//    for(int i = 2; i < n; i++) {
//      if(n % i ==0) {
//        return false;
//      } 
//
//    }
//    return true;
//
//  }
//
//}

