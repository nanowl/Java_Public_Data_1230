package 게임만들기;

public class Character extends Unit implements GameAction{
    /*
        name : 캐릭터 이름
        pP : 물리 힘
        mP : 마법 힘
        pH : 물리 적중률
        mH : 마법 적중률
        ultra : 특수 기술에 대한 공격력
        hp : 체력
     */
    public Character(String name, int pP, int mP, double pH, double mH, int ultra, int hp) {
        this.name = name;
        this.strength = pP;
        this.intelligence = mP;
        this.pHit = pH;
        this.mHit = mH;
        this.ultraPower = ultra;
        this.hp = hp;
    }

    @Override
    public double pAttack() {
        return strength * pHit;
    }

    @Override
    public double mAttack() {
        return intelligence * mHit;
    }

    @Override
    public int ultimate() {
        return ultraPower;
    }

    @Override
    public boolean setDamage(double damage) {
        if(hp > damage) {
            hp -= damage;
            System.out.println("남아 있는 " + name + "의 체력은 " + hp + "입니다.");
            return false; // false 는 캐릭터가 살아 있음을 의미 함.
        } else {
            System.out.println(name + "이 죽었습니다. 게임을 종료 합니다.");
            return true;
        }
    }
}
