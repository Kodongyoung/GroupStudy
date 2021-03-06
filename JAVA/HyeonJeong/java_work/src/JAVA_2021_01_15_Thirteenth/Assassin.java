package JAVA_2021_01_15_Thirteenth;

public class Assassin extends Theif implements SkillTree {
    int incantation;

    public Assassin(int atk, int def, int dex, int intel, int hp,
                    int mental, float successRate, int incantation) {

        super(atk, def, dex, intel, hp, mental, successRate);
        this.incantation = incantation;
    }

    public void skill1() {
        System.out.println("암검: " + dex * 18);
        System.out.println("후방 타격시 추가 고정 데미지 400, 일정 확률로 즉사");
        System.out.println("PK 모드 및 보스전에서 즉사 발동시 추가 고정 데미지 500");
    }

    @Override
    public void skill2() {
        System.out.println("은신: dex 1.2배 증가");
        System.out.println("이동 속도 30% 증가");
    }
}
