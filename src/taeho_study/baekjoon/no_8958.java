package taeho_study.baekjoon;

import java.util.Scanner;

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. 
//O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 
//문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 
//예를 들어, 10번 문제의 점수는 3이 된다.

//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.

public class no_8958 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    sc.nextLine();
    String[] arr = new String[N];
    char ch = ' ';



    for(int i = 0 ; i < N ; i++) {
      int count = 0;
      int sum = 0;
      arr[i] = sc.nextLine();
      for(int j = 0; j < arr[i].length() ; j++) {
        ch = arr[i].charAt(j);
        if(ch == 'O') {
          count++;
        }
        else {
          count = 0;
        }
        sum += count;
      }

      System.out.println(sum);
    }

  }

}
