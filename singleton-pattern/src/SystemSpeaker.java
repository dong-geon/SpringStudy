public class SystemSpeaker {
    // 외부로 부터 해당 인스턴스 접근제어
    static private SystemSpeaker instance;
    private int volume;
    private SystemSpeaker(){
        volume = 5;
    }
    // instance가 없을 시에만 스피커 객체 생성, 이 외는 원래의 인스턴스를 가리킨다.
    public static SystemSpeaker getInstance(){
        if(instance == null){
            // 시스템 스피커
            instance = new SystemSpeaker();
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
