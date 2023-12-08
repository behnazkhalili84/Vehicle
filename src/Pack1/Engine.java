package Pack1;

public class Engine {
    private int hoursePower;
    private double price;
    private long serialnum;
    private static long serialnumCounter= 1000;
    public Engine() {
        hoursePower = 200;
        price = 10000;
        serialnum = serialnumCounter;
        serialnumCounter++;
    }

    public Engine(int hoursePower, double price) {
        this.hoursePower = hoursePower;
        this.price = price;
        serialnum = serialnumCounter;
        serialnumCounter++;
    }

    public int getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(int hoursePower) {
        this.hoursePower = hoursePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public long getSerialnum() {
        return serialnum;
    }

    @Override
    public String toString() {
        return "Engine [hoursePower=" + hoursePower + ", price=" + price +
                ", serialnum=" + serialnum + "]";
    }

}
