package taeho_study.javajungsuk_chapter7;

class Member {
  public int no;
  public String name;
  public String email;
  public String password;
  public String photo;
  public String tel;


  //
  //  Member(){
  //
  //    this.password = "100";
  //    this.photo = "집가고싶다.jpg";
  //    this.tel = "010-1234-5678";
  //  }

  Member(int no, String name){
    this.no = no;
    this.name = name;
  }


}


public class practice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // Member member = new Member();
    Member member = new Member(300, "집이 그리운 선영");
    //    member.no = 2;
    //    member.name = "하선영";

    System.out.printf("no = %d\n", member.no);
    System.out.printf("name = %s\n", member.name);
    System.out.printf("email = %s\n", member.email);
    System.out.printf("password = %s\n", member.password);
    System.out.printf("photo = %s\n", member.photo);
    System.out.printf("tel = %s\n", member.tel);

  }

}
