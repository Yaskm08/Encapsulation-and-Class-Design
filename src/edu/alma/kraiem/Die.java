/**
 * Programming Activity 3: Encapsulation and Class Design
 * Yassine Kraiem
 * CSC230 F24
 * 10/07/24
 * Lab 3
 */

package edu.alma.kraiem;

/**
 * The Die class represents a single die with a specified number of sides.
 * It implements the Rollable interface, encapsulating the logic of rolling a die.
 */
public class Die implements Rollable {
    private int sides;

    /**
     * Constructor for Die. Initializes the die with the specified number of sides.
     * @param sides The number of sides the die has (e.g., 6 for a 6-sided die).
     * @throws IllegalArgumentException if sides are less than 2.
     */
    public Die(int sides) {
        if (sides < 2) {
            throw new IllegalArgumentException("A die must have at least 2 sides.");
        }
        this.sides = sides;
    }

    /**
     * Rolls the die and returns a random value between 1 and the number of sides.
     * @return The result of the die roll.
     */
    @Override
    public int roll() {
        return (int) (Math.random() * sides) + 1;
    }

    /**
     * @return The number of sides of the die.
     */
    public int getSides() {
        return sides;
    }

    @Override
    public String toString() {
        return "d" + sides;
    }
}
