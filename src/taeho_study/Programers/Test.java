package taeho_study.Programers;

//"Zbcdefg"   "gfedcbZ"
// bacKceb

public class Test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Solution9 sol = new Solution9();
    System.out.println(sol.solution("Zbcdefg"));


  }

}


//class Solution9 {
//  public String solution(String s) {
//    String answer = "";
//    String[] arr = s.split("");
//
//
//    Arrays.sort(arr, Collections.reverseOrder());
//
//    for(int i = 0 ; i < arr.length ; i ++) {
//      answer += arr[i];
//    }
//
//    return answer;
//  }
//}
class Solution9 {
  public String solution(String s) {
    String answer = "";

    char[] arr = new char[s.length()];

    for(int i = 0 ; i < s.length(); i++) {
      arr[i] = s.charAt(i);
    }

    for(int i = 0 ; i < arr.length ; i++) {

      for(int j = i ; j < arr.length ; j++) {
        if(arr[j] > arr[i]) {
          char tmp;
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }

    answer = new String(arr);


    return answer;

  }
}


//
//    while(true) {
//      for(int i = 0 ; i < arr.length ; i++) {
//        if(i >=1 ) {
//          if(arr[i] > arr[i-1]) {
//            temp = arr[i-1];
//            arr[i-1] = arr[i];
//            arr[i] = temp;
//
//          }
//        }
//        cnt++;
//      }
//      if(cnt > 100)
//        break;
//    }


//answer = String.valueOf(arr);


//    return arr2;
