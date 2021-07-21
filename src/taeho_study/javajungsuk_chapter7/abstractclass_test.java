package taeho_study.javajungsuk_chapter7;


class Product{
  int price;
  int bounsPoint;

  Product(){
    this.price = 0;
    this.bounsPoint = 0;
  }

  Product(int price){
    this.price = price;
    bounsPoint = price / 10;
  }
}

class Tv extends Product{

  Tv(){
    super(100);
  }

  public String toString() {
    return "TV";
  }


}

class Computer extends Product{

  Computer(){
    super(200);
  }

  public String toString() {
    return "Computer";
  }
}

class Audio extends Product{

  Audio(){
    super(50);
  }

  public String toString() {
    return "Audio";
  }
}

class Buyer{

  int money = 1000;
  int bonusPoint = 0;
  Product[] cart = new Product[10];
  int i = 0;

  void buy(Product p) {
    if(money < p.price) {
      System.out.println("소유한 금액이 부족합니다.");
      return;
    }
    money -= p.price;
    bonusPoint += p.bounsPoint;
    cart[i] = p;
    i++;
    System.out.println(p+"를 구매하였습니다.");
  }

  void summary() {
    int sum = 0;
    String cartList = "";

    for(int i = 0; i < cart.length ; i++) {
      Product p = cart[i];
      //sum += p.price;
      cartList += p+",";

    }
    System.out.println("구매하신 물품의 총 금액은 " + sum +"입니다.");
    System.out.println("현재 남은 금액은 "+money+"입니다.");
    System.out.println("구매하신 물품은 "+cartList + "입니다.");
  }

}




public class abstractclass_test {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Buyer b = new Buyer();
    b.buy(new Tv());
    b.buy(new Computer());
    b.buy(new Audio());
    b.summary();
  }

}