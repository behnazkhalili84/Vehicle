package Pack1;

public class Body {
    private double price;
    private double weight;
    private long serialnum;
    private static long serialnumCounter= 500;
    public Body() {
        price = 8000;
        weight = 2000;
        serialnum = serialnumCounter;
        serialnumCounter++;
    }

    public Body(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
