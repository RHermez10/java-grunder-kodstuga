package Vecka43;

public class Dragon extends Monster implements SpecialAttack {

    Dragon() {
        super("Dragon");
    };

    @Override
    public int attack() {
        return 25;

    };

    @Override
    public int useSpecialAttack() {
        return 35;
    }

}
