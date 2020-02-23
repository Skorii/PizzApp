package be.gonybeckers.pizza;

public class Pizza {
    private String pizzeria;
    private String name;
    private String[] ingredients;
    private String[] supplements;
    private float price;

    public Pizza(String pizzeria, String name, String[] ingredients, String[] supplements, float price) {
        this.pizzeria = pizzeria;
        this.name = name;
        this.ingredients = ingredients;
        this.supplements = supplements;
        this.price = price;
    }

    public Pizza(String pizzeria, String name, String[] ingredients, float price) {
        this.pizzeria = pizzeria;
        this.name = name;
        this.ingredients = ingredients;
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

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getSupplements() {
        return supplements;
    }

    public void setSupplements(String[] supplements) {
        this.supplements = supplements;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
