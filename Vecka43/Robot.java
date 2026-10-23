package Vecka43;

public class Robot extends Monster implements SpecialAttack {

    Robot() {
        super("Robot");
    }

    @Override
    public int attack() {
        return 20;
    }

    @Override
    public int useSpecialAttack() {
        return 35;
    }

}
