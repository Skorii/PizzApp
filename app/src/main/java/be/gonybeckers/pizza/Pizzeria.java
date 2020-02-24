package be.gonybeckers.pizza.pizzeria;


import java.util.ArrayList;

public class Pizzeria {
    private Information information;
    private Opening opening;
    private ArrayList<Pizza> pizzas;
    private ArrayList<Supplement> supplements;

    public Pizzeria(Information information, Opening opening, ArrayList<Pizza> pizzas, ArrayList<Supplement> supplements) {
        this.information = information;
        this.opening = opening;
        this.pizzas = pizzas;
        this.supplements = supplements;
    }

    public Information getInfos() {
        return information;
    }

    public void setInfos(Information information) {
        this.information = information;
    }

    public Opening getOpening() {
        return opening;
    }

    public void setOpening(Opening opening) {
        this.opening = opening;
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public ArrayList<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(ArrayList<Supplement> supplements) {
        this.supplements = supplements;
    }
}
