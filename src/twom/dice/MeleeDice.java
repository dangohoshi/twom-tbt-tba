package twom.dice;

public class MeleeDice extends AssaultDice {
    public MeleeDice() {
        super(new MeleeDiceEnum[] {
                MeleeDiceEnum.ONE,
                MeleeDiceEnum.TWO,
                MeleeDiceEnum.THREE,
                MeleeDiceEnum.AX,
                MeleeDiceEnum.MISS,
                MeleeDiceEnum.MISS
        });
    }
}

enum MeleeDiceEnum {
    ONE, TWO, THREE, AX, MISS
}
