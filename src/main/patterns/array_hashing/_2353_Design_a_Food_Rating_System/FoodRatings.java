package main.patterns.array_hashing._2353_Design_a_Food_Rating_System;

import java.util.*;

public class FoodRatings {

    private static class Food {
        String name;
        int rating;
        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }

    private Map<String, Integer> foodToRating;
    private Map<String, String> foodToCuisine;
    private Map<String, PriorityQueue<Food>> cuisineToFood;

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToRating = new HashMap<>();
        foodToCuisine = new HashMap<>();
        cuisineToFood = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            foodToRating.put(foods[i], ratings[i]);
            foodToCuisine.put(foods[i], cuisines[i]);

            cuisineToFood.computeIfAbsent(cuisines[i], k -> new PriorityQueue<>(
                    (a, b) -> {
                        if (a.rating != b.rating) return b.rating - a.rating;
                        return a.name.compareTo(b.name);
                    }
            )).add(new Food(foods[i], ratings[i]));
        }
    }

    public void changeRating(String food, int newRating) {
        foodToRating.put(food, newRating);
        String cuisine = foodToCuisine.get(food);
        cuisineToFood.get(cuisine).add(new Food(food, newRating));
    }

    public String highestRated(String cuisine) {

        PriorityQueue<Food> foods = cuisineToFood.get(cuisine);

        while (!foods.isEmpty()) {
            Food top = foods.peek();

            if (top.rating != foodToRating.get(top.name)) {
                foods.poll();
            } else {
                return top.name;
            }
        }

        return "";
    }
}
