package practice.chap7.p11;
// 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
// 기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
// 메서드명 : gotoPrevChannel
//기 능 : 현재 채널을 이전 채널로 변경한다.
// 반환타입 : 없음
//매개변수 : 없음

class MyTv2 {
    boolean isPowerOn;
    int channel;
    int volume;
    int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return;
        prevChannel = this.channel; // this.chanel이 현재 가지고 있는 채널
        this.channel = channel; // 현재 가지고 있는 채널에 channel 입력
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}
public class P11 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10); // channel = 10;
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20); // channel = 20;
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
