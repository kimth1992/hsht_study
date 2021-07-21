package taeho_study.javajungsuk_chapter7;


class MyTv2{
  private boolean isPowerOn;
  private int channel;
  private int volume;
  int prevchannel;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  int getVolume() {
    return volume;
  }

  void setVolume(int num) {

    this.volume = num;
  }

  int getChannel() {
    return channel;
  }

  void setChannel(int num) {
    prevchannel = this.channel;
    this.channel = num;
  }

  void gotoPrevChannel() {
    setChannel(prevchannel);

  }



}


public class Prac7_10 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    MyTv2 t = new MyTv2();

    t.setChannel(10);
    System.out.println("CH:"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH:"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());    
    t.gotoPrevChannel();
    System.out.println("CH:"+t.getChannel());


  }

}
