package While문기본;
//정해진 횟수 반복하기
public class WhileEx1 {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true) {
            treeHit++;
            System.out.println("나무를 " + treeHit + "회 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무가 넘어갑니다.");
                break;
            }
        }
    }
}
