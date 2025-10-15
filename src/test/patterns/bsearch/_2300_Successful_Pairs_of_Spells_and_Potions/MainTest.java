package test.patterns.bsearch._2300_Successful_Pairs_of_Spells_and_Potions;

import org.junit.jupiter.api.Test;

import main.patterns.bsearch._2300_Successful_Pairs_of_Spells_and_Potions.Main;

import static org.junit.jupiter.api.Assertions.*;
class MainTest {

    Main main = new Main();

    @Test
    void successfulPairs_basicCase() {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 7;
        int[] expected = {4, 0, 3};

        assertArrayEquals(expected, main.successfulPairs(spells, potions, success));
    }

    @Test
    void successfulPairs_allFail() {
        int[] spells = {1, 1};
        int[] potions = {1, 1};
        long success = 10;
        int[] expected = {0, 0};

        assertArrayEquals(expected, main.successfulPairs(spells, potions, success));
    }

    @Test
    void successfulPairs_allPass() {
        int[] spells = {10, 20};
        int[] potions = {1, 2, 3};
        long success = 10;
        int[] expected = {3, 3};

        assertArrayEquals(expected, main.successfulPairs(spells, potions, success));
    }

    @Test
    void successfulPairs_emptyInput() {
        int[] spells = {};
        int[] potions = {1, 2, 3};
        long success = 10;
        int[] expected = {};

        assertArrayEquals(expected, main.successfulPairs(spells, potions, success));
    }

    @Test
    void successfulPairs_largeNumbers() {
        int[] spells = {100000};
        int[] potions = {100000};
        long success = 10_000_000_000L;
        int[] expected = {1};

        assertArrayEquals(expected, main.successfulPairs(spells, potions, success));
    }
}