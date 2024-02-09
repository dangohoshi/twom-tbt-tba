package twom.dice;

import java.util.Random;

public abstract class AssaultDice implements Dice {

    /**
     * A list of the results of the dice, which cannot be null
     * or an empty array. Enum recommended.
     */
    Object[] results;

    public AssaultDice(Object[] results) {
        this.results = results;
    }

    private final Random random = new Random();

    /**
     * Roll the dice
     *
     * @return an object representing the outcome of the dice.
     */
    @Override
    public Object roll() {
        return results[random.nextInt(results.length)];
    }

}
