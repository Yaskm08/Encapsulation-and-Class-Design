/**
 * Programming Activity 3: Encapsulation and Class Design
 * Yassine Kraiem
 * CSC230 F24
 * 10/07/24
 * Lab 3
 */

package edu.alma.kraiem;

/**
 * Rollable interface to represent any object that can be rolled.
 * Classes implementing this interface must define the roll method,
 * which returns the result of a roll.
 */
public interface Rollable {
    /**
     * Rolls the object and returns the result.
     * @return the result of the roll
     */
    int roll();
}
