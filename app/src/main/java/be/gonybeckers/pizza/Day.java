package be.gonybeckers.pizza.pizzeria;

public class Day {
    private String day;
    private String evening;

    public Day(String day, String evening) {
        this.day = day;
        this.evening = evening;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getEvening() {
        return evening;
    }

    public void setEvening(String evening) {
        this.evening = evening;
    }
}
