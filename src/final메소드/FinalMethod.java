package final메소드;

/*
    final keyword는 최종상태라는 의미가 있음
    final keyword를 클래스, 필드, 메소드 선언 시 사용 가능
 */
public class FinalMethod {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar("Ferrari");
        sportsCar.setTurbo(true);
        sportsCar.infoCar();
        sportsCar.accelerator();
        sportsCar.breakPanel();

        ElectricCar ev6 = new ElectricCar("EV6");
        ev6.setAutoDrv(true);
        ev6.viewCar();
    }
}
