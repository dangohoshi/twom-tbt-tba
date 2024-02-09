package twom.dice;

public class BareDice extends AssaultDice {
    public BareDice() {
        super(new BareDiceEnum[] {
                BareDiceEnum.ONE,
                BareDiceEnum.TWO,
                BareDiceEnum.MISS,
                BareDiceEnum.MISS,
                BareDiceEnum.MISS,
                BareDiceEnum.MISS
        });
    }
}

enum BareDiceEnum {
    ONE, TWO, MISS
}