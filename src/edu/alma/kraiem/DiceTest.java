/**
 * Programming Activity 3: Encapsulation and Class Design
 * Yassine Kraiem
 * CSC230 F24
 * 10/07/24
 * Lab 3
 */

package edu.alma.kraiem;

/**
 * Driver class to test the Die and Handful classes.
 */
public class DiceTest {
    public static void main(String[] args) {
        // Test a single die roll
        Die d6 = new Die(6);
        System.out.println("Rolling a d6: " + d6.roll());

        // Test handful of dice: 4d6
        Handful handful4d6 = new Handful(4, 6);
        System.out.println("Rolling " + handful4d6 + ": " + handful4d6.rollAll());

        // Test handful of dice: 14d10
        Handful handful14d10 = new Handful(14, 10);
        System.out.println("Rolling " + handful14d10 + ": " + handful14d10.rollAll());

        // Test rolling individual results
        Handful handful5d8 = new Handful(5, 8);
        System.out.print("Rolling " + handful5d8 + ": ");
        int[] results = handful5d8.rollAllResults();
        for (int result : results) {
            System.out.print(result + " ");
        }
        System.out.println();
    }
}
