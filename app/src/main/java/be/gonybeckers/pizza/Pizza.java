package be.gonybeckers.pizza.pizzeria;

import java.util.ArrayList;

public class Pizza {
    private String pizzeria;
    private String name;
    private ArrayList<String> ingredients;
    private ArrayList<Supplement> supplements;
    private String[] price;

    public Pizza(String pizzeria, String name, ArrayList<String> ingredients, ArrayList<Supplement> supplements, String[] price) {
        this.pizzeria = pizzeria;
        this.name = name;
        this.ingredients = ingredients;
        this.supplements = supplements;
        this.price = price;
    }

    public Pizza(String pizzeria, String name, ArrayList<String> ingredients, String[] price) {
        this.pizzeria = pizzeria;
        this.name = name;
        this.ingredients = ingredients;
        this.supplements = new ArrayList<>();
        this.price = price;
    }

    public String getPizzeria() {
        return pizzeria;
    }

    public void setPizzeria(String pizzeria) {
        this.pizzeria = pizzeria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }

    public String[] getPrice() {
        return price;
    }

    public void setPrice(String[] price) {
        this.price = price;
    }
}
