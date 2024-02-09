package twom.dice;

public class GunDice extends AssaultDice {
    public GunDice() {
        super(new GunDiceEnum[] {
                GunDiceEnum.MISS,
                GunDiceEnum.MISS,
                GunDiceEnum.TWO,
                GunDiceEnum.TWO,
                GunDiceEnum.THREE,
                GunDiceEnum.PASS
        });
    }
}

enum GunDiceEnum {
    TWO, THREE, PASS, MISS
}
