package 은행만들기;

public class BankMain {
    public static void main(String[] args) {
        BankClass kakao = new BankClass("카카오", 1000);
        BankClass shinHan = new BankClass("신한", 1000);
        BankClass softBank = new BankClass("소프트뱅크", 0);
        kakao.setDeposit(12000);
        kakao.setWithdraw(15000);
        kakao.viewAccount();
        System.out.println(BankClass.getCnt());

        System.out.println(Util.getCurrentDate("yyyy년MM월dd일 hh:mm:ss"));
        System.out.println("서버 주소 : " + Util.KH_DOMAIN);
    }
}
