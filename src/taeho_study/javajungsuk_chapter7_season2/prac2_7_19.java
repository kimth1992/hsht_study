package taeho_study.javajungsuk_chapter7_season2;

public class prac2_7_19 {

  public static void main(String[] args) {

    Buyer b = new Buyer();
    b.buy(new Tv());
    b.buy(new Computer());
    b.buy(new Tv());
    b.buy(new Audio());
    b.buy(new Computer());
    b.buy(new Computer());
    b.buy(new Computer());

    b.summary();

  }

}

class Buyer{
  int money = 1000;
  Product[] cart = new Product[3];      // 구입한 제품을 저장하기 위한 배열
  int i = 0;                            // Product 배열 cart에 사용될 index

  void buy(Product p) {
    if(p.price > money) {
      System.out.println("가진 돈이 너무 부족해서 이 물건을 살 수가 없습니다.");
      return;
    }
    this.money -= p.price;
    add(p);

  }

  void add(Product p) {
    if(i >= cart.length) {
      Product[] cart2 = new Product[cart.length * 2];
      System.arraycopy(cart, 0, cart2, 0, cart.length);
      // cart2 = Arrays.copyOf(cart, cart.length);
      this.cart = cart2;
    }
    cart[i++] = p;
  }

  void summary() {
    for(int i = 0 ; i < cart.length ; i++) {
      System.out.print("구매한 물건:"+ cart[i]+",");
    }

    int sum = 0;
    for(int i = 0 ; i < cart.length ; i++) {
      sum += cart[i].price;
    }
    System.out.println("사용한 금액 : "+sum);

    System.out.println("남은 금액 : "+ money);

  }
}

class Product{
  int price;

  Product(int price){
    this.price = price;
  }
}

class Tv extends Product{
  Tv() {super(100);}

  public String toString() {return "Tv";}
}

class Computer extends Product {
  Computer() {super(200);}

  public String toString() {return "Computer";}

}

class Audio extends Product {
  Audio() {super(50);}

  public String toString() {return "Audio";}

}