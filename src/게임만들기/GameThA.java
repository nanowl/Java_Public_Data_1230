package 게임만들기;

public class GameThA extends Thread{
    private Character warrior;
    private Character wizard;

    public GameThA(Character warrior, Character wizard) {
        this.warrior = warrior;
        this.wizard = wizard;
    }

    @Override
    public void run() {
        int normal; //일반공격에 대한 확률
        int special; //특수공격에 대한 확률
        boolean endGame = false; //게임의 진행 여부를 판단하는 플래그
        while (true) {
            try {
                sleep(3000); // 게임의 진행속도를 맞추기 위해서
                normal = (int)(Math.random() * 2); // 0, 1의 값이 만들어 짐
                special = (int) (Math.random() * 20);
                if(normal == 1) { // normal 은 0/1 만 있음
                    System.out.println("물리 공격 : " + wizard.name + "에게"
                            + warrior.pAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.pAttack());
                } else {
                    System.out.println("마법 공격 : " + wizard.name + "에게"
                            + warrior.mAttack() + "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.mAttack());
                }
                if(special == 10) { // 10이라는 값이 나올 확률은 1/20 이다.
                    System.out.println(warrior.name + " 궁극기 발동 !!!, "
                            + wizard.name + "에게" + warrior.ultimate() +
                            "데미지를 입혔습니다.");
                    endGame = wizard.setDamage(warrior.ultimate());
                }
                if(endGame) {
                    System.exit(0);
                }
            } catch (InterruptedException e) {}
        }
    }
}
