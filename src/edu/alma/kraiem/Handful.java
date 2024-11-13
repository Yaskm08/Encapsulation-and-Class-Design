/**
 * Programming Activity 3: Encapsulation and Class Design
 * Yassine Kraiem
 * CSC230 F24
 * 10/07/24
 * Lab 3
 */

package edu.alma.kraiem;

import java.util.ArrayList;
import java.util.List;

/**
 * The Handful class represents a collection of dice that can be rolled together.
 * It can handle rolling multiple dice of the same type (e.g., 4d20 or 14d10).
 */
public class  Handful {
    private List<Die> dice;

    /**
     * Constructor for Handful. Creates a handful of dice with the specified number of dice and sides.
     * @param numberOfDice The number of dice to roll.
     * @param sides The number of sides on each die.
     */
    public Handful(int numberOfDice, int sides) {
        dice = new ArrayList<>();
        for (int i = 0; i < numberOfDice; i++) {
            dice.add(new Die(sides));
        }
    }

    /**
     * Rolls all dice in the handful and returns the total sum of all rolls.
     * @return The total sum of all dice rolls.
     */
    public int rollAll() {
        int total = 0;
        for (Die die : dice) {
            total += die.roll();
        }
        return total;
    }

    /**
     * Rolls all dice in the handful and returns an array of individual results.
     * @return An array of individual die rolls.
     */
    public int[] rollAllResults() {
        int[] results = new int[dice.size()];
        for (int i = 0; i < dice.size(); i++) {
            results[i] = dice.get(i).roll();
        }
        return results;
    }

    /**
     * @return The number of dice in the handful.
     */
    public int getNumberOfDice() {
        return dice.size();
    }

    /**
     * @return The type of dice in the handful (e.g., 6 for d6, 10 for d10).
     */
    public int getDieSides() {
        return dice.isEmpty() ? 0 : dice.get(0).getSides();
    }

    @Override
    public String toString() {
        return getNumberOfDice() + "d" + getDieSides();
    }
}
