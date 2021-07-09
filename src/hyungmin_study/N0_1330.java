/*    '틀렸습니다' 나옵니다.
 *      이클립스 에서는 정상적으로 실행되는데 어떤 부분이 틀렸는지 잘 모르겠네요ㅜㅜ
 * 
 * 
 */


package hyungmin_study;

public class N0_1330 {

  public static void main(String[] args) {
    java.util.Scanner scn = new java.util.Scanner(System.in);

    int a = scn.nextInt();
    int b = scn.nextInt();
    System.out.printf("%d %d",a,b);

    if(a>b) {
      System.out.println(">");
    }
    if(a<b) {
      System.out.println("<");
    }
    if (a==b){
      System.out.println("==");
    }
  }


}