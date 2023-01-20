package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 숨겨져있음
    int MIN_TEMP = 0;
    void airConON(); // public abstract 가 자동추가
    void airConOFF();
    void setAirConTemp(int tmp);
}
