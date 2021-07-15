package taeho_study.javajungsuk_chapter3;


// 사과 123개를 하나의 바구니에 10개씩 담을 수 있따면 13개의 바구니가 필요할 것이다.
// 사과를 담는 바구니의 갯수를 구하시오.


public class prac3_2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int numOfApples = 300;
    int sizeOfBucket = 13;
    int numOfBucket = numOfApples%sizeOfBucket == 0? (numOfApples / sizeOfBucket) : 
      (numOfApples / sizeOfBucket)+1;




    System.out.println("필요한 바구니의 수 :" +numOfBucket);

  }

}
