package twom.dice;

import java.util.Random;

public class NumberDice implements Dice {

    private final int sides;

    private final Random random;

    public NumberDice() {
        this(0);
    }

    public NumberDice(int sides) {
        this.sides = sides;
        this.random = new Random();
    }

    /**
     * Roll the dice
     *
     * @return an object representing the outcome of the dice.
     */
    @Override
    public Object roll() {
        return random.nextInt(sides);
    }
}
