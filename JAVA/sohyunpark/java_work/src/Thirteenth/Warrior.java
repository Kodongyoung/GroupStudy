package Thirteenth;

public class Warrior extends Adventurer implements SkillTree {
    float anger;

    public Warrior(int atk, int def, int dex,
                   int intel, int con, int mental, float anger) {
        super(atk, def, dex, intel, con, mental);
        this.anger = anger;
    }

    public void skill1() {
        System.out.println("파워 슬래쉬 : " + (atk + dex) * 12);
    }

    public void skill2() {
        System.out.println("방패치기 : " + (atk + def) * 3);
        System.out.println("대상을 1초간 스턴 상태로 만듭니다.");
    }

    public void subSkill() { // Adventurer 꺼
        super.skill1();
    }

}
