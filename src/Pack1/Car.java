package Pack1;

public class Car extends Vehicle {
    private Engine engine;
    private Body body;
    private double price;
    private int year;
    private int numOfSeats;
    private int maxspeed;
    private int numOfDoors;
    private double weight;
    private double height;


    private long serialNum;
    private static long serialNumcnt= 3000;
    private static final double profitrate = 2.5;
    public Car(){
        engine = new Engine();
        body = new Body();
        price = (engine.getPrice()+body.getPrice())*profitrate;
        year = 2000;
        maxspeed = 280;
        numOfDoors = 4;
        weight = 200;
        height = 2;
        System.out.println("Creating Car from default cons");
        numOfSeats = 5;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }


    public Car(int numOfDoors, double price, Engine engine, Body body, double price1, int year, int numOfSeats, int maxspeed, int numOfDoors1, double weight, double height, long serialNum) {
        super(numOfDoors, price);
        this.engine = engine;
        this.body = body;
        this.price = (engine.getPrice()+body.getPrice())*profitrate;
        this.year = year;
        this.numOfSeats = numOfSeats;
        this.maxspeed = maxspeed;
        this.numOfDoors = numOfDoors1;
        this.weight = weight;
        this.height = height;
        this.serialNum = serialNum;
    }

    public Car(Car car){
        setEngine(car.getEngine());
        setBody(car.getBody());
        setPrice(car.getPrice());
        setYear(car.getYear());
        setMaxspeed(car.getMaxspeed());
        setNumOfDoors(car.getNumOfDoors());
        setWeight(car.getWeight());
        setHeight(car.getHeight());
        System.out.println("Creating Car from Copy cons");
        setNumOfDoors(car.getNumOfDoors());
        setPrice(car.getPrice());
        setNumOfSeats(car.getNumOfSeats());
        setSerialNum(car.getSerialNum());
        serialNumcnt++;
    }
    public int getNumOfSeats(){
        return numOfSeats;
    }
    public void setNumOfSeats(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Car has" + numOfSeats
                + " seats and the price for Car is " + getPrice()
                + "Also this Car has " + getNumOfDoors() + " Doors";
    }
    public long getSerialNum() {
        return serialNum;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    @Override
    public int getNumOfDoors() {
        return numOfDoors;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSerialNum(long serialNum) {
        this.serialNum = serialNum;
    }

    public Car clone() {
        return new Car(this);
    }


}
