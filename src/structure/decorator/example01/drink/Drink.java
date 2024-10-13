package structure.decorator.example01.drink;

public abstract class Drink {

    private double price;

    private String des;


    public Drink(double price, String des) {
        this.price = price;
        this.des = des;
    }

    public abstract double cost();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}

