package 은행만들기;


public class BankClass {
    private static int cnt = 0; // 같은 클래스 내에서 접근 가능한 정적 변수 ( 클래스 변수 )
    private int account;
    private String bank;
    public BankClass(String name, int account) {
        cnt++;
        this.bank = name;
        this.account = account;
        System.out.println(name + " 은행에 계좌를 개설 합니다. 잔액은 " + account + "입니다.");
    }
    public static int getCnt() {
        return cnt;
    }
    public void setDeposit(final int deposit) {
        this.account += deposit;
        System.out.println(deposit + "을 예금 했습니다.");
    }
    public void setWithdraw(final int withdraw){
        if (withdraw > account) {
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= withdraw;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "입니다.");
    }
}
