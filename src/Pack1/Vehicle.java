package Pack1;

public abstract class Vehicle {
    protected int numOfDoors;
    protected double price;
    private long serialNum;
    private static long serialNumcnt = 1000;

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public final void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0) {
            return;
        }else {
            this.price = price;
        }
    }

    public Vehicle(int numOfDoors, double price) {
        System.out.println("Creating vehicle from parameter cons");
        this.numOfDoors = numOfDoors;
        this.price = price;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }
    public Vehicle(){
        System.out.println("Creating vehicle from default cons");
        numOfDoors = 4;
        price = 1000;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }
    public Vehicle(Vehicle vehicle){
        System.out.println("Creating vehicle from copy cons");
        this.numOfDoors = vehicle.numOfDoors;
        this.price = vehicle.price;
        serialNum = serialNumcnt;
        serialNumcnt++;

    }
    public void showInfo(){
        System.out.println("numOfDoors=" + numOfDoors + ", price=" + price + "]");
    }

    @Override
    abstract public String toString();

    public abstract long getSerialNum();


    abstract public Vehicle clone();
}
