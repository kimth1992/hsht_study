package taeho_study.javajungsuk_chapter7_season2;

class MyTv2{
  private boolean isPowerOn;
  private int channel;
  private int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;
  int prevChannel;

  int getVolume() {
    return this.volume;
  }

  void setVolume(int volume) {
    if(volume < MIN_VOLUME || volume > MAX_VOLUME)
      return;

    this.volume = volume;
  }

  int getChannel() {
    return this.channel;
  }

  void setChannel(int channel) {
    if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)
      return;

    prevChannel = this.channel;
    this.channel = channel;
  }

  void gotoPrevChannel() {

    setChannel(prevChannel);
  }

}

public class prac2_7_10 {

  public static void main(String[] args) {

    MyTv2 t = new MyTv2();

    t.setChannel(10);
    System.out.println("CH :"+t.getChannel());
    t.setChannel(20);
    System.out.println("CH :"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH :"+t.getChannel());
    t.gotoPrevChannel();
    System.out.println("CH :"+t.getChannel());


  }

}
