package 클래스정렬;

public class CarEx implements Comparable<CarEx> {
    public String modeName;
    public int modelYear;
    public String color;

    public CarEx(String modeName, int modelYear, String color) {
        this.modeName = modeName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarEx o) {
        if (this.modelYear == o.modelYear) { // 차의 연식이 같으면
            return this.modeName.compareTo(o.modeName); // 이름을 기준으로 사전순 정렬
        } else if (this.modelYear < o.modelYear) return -1;
        else return 1;
    }
}
