package de.gregorstallmeister.codewars.test;

import de.gregorstallmeister.codewars.PeteBaker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

// https://www.codewars.com/kata/525c65e51bf619685c000059/train/java

public class PeteBakerTest {
    @Test
    void basicTestFirst() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(2, PeteBaker.cakesFirst(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredientFirst() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(0, PeteBaker.cakesFirst(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void basicTestSecond() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(2, PeteBaker.cakesSecond(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredientSecond() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(0, PeteBaker.cakesSecond(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void basicTest() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(2, PeteBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }

    @Test
    void missingIngredient() {
        Map<String, Integer> recipe = Map.of(
                "flour", 500,
                "sugar", 200,
                "eggs", 1,
                "cinnamon", 300);
        Map<String, Integer> available = Map.of(
                "flour", 1200,
                "sugar", 1200,
                "eggs", 5,
                "milk", 200);
        assertEquals(0, PeteBaker.cakes(recipe, available), "For recipe " + recipe + " and ingredients " + available);
    }
}
