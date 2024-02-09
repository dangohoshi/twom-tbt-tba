package twom.characters;

import java.util.Map;

/**
 * Abstract character of the game
 */
public abstract class AbstractCharacter {
    /**
     * Name of the Character
     */
    String name;
    /**
     * Career of the Character
     */
    String career;
    /**
     * Skills of the Character
     */
    Map<String, String> skill;
    /**
     * How many times can this Character re-roll the dice
     */
    int prowess;
    /**
     * For sympathy checks
     */
    int sympathy;
    /**
     * How many things can this Character carry when searching
     */
    int load;
    /**
     * Emotional reaction A.
     */
    String reactionA;
    /**
     * Emotional reaction B.
     */
    String reactionB;
    /**
     * Emotional reaction C.
     */
    String reactionC;

    int hunger;

    int sadness;

    int fatigue;

    int injury;

    int illness;

    public String getName() {
        return name;
    }

    public String getCareer() {
        return career;
    }

    public int getProwess() {
        return prowess;
    }

    public int getSympathy() {
        return sympathy;
    }

    public int getLoad() {
        return load;
    }

    public String getReactionA() {
        return reactionA;
    }

    public String getReactionB() {
        return reactionB;
    }

    public String getReactionC() {
        return reactionC;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSadness() {
        return sadness;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getInjury() {
        return injury;
    }

    public int getIllness() {
        return illness;
    }

    public AbstractCharacter setHunger(int hunger) {
        this.hunger = hunger;
        return this;
    }

    public AbstractCharacter setSadness(int sadness) {
        this.sadness = sadness;
        return this;
    }

    public AbstractCharacter setFatigue(int fatigue) {
        this.fatigue = fatigue;
        return this;
    }

    public AbstractCharacter setInjury(int injury) {
        this.injury = injury;
        return this;
    }

    public AbstractCharacter setIllness(int illness) {
        this.illness = illness;
        return this;
    }

    /**
     * When reaction A is called
     */
    public abstract void onReactionA();

    /**
     * When reaction B is called
     */
    public abstract void onReactionB();

    /**
     * When reaction C is called
     */
    public abstract void onReactionC();

}
