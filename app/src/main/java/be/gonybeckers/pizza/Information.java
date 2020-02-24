package be.gonybeckers.pizza.pizzeria;

public class Information {
    private String establishment;
    private String address;
    private String phone;

    public Information(String establishment, String address, String phone) {
        this.establishment = establishment;
        this.address = address;
        this.phone = phone;
    }

    public String getEstablishment() {
        return establishment;
    }

    public void setEstablishment(String establishment) {
        this.establishment = establishment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
