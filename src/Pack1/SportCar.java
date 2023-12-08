package Pack1;

public class SportCar extends Car {
    private double gasconsuption;
    private long serialNum;
    private static long serialNumcnt = 4000;
    public SportCar(){
        System.out.println("Creating sport Car from default cons");
        gasconsuption = 4;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }

    public SportCar(int numOfDoors, double price, int numOfSeats, double gasconsuption) {
        super(numOfDoors, price, numOfSeats);
        this.gasconsuption = gasconsuption;
        System.out.println("Creating Sport Car from super cons");
        serialNum = serialNumcnt;
        serialNumcnt++;
    }
    public SportCar(SportCar sportCar){
        System.out.println("Creating Sport Car from Copy cons");
        setNumOfDoors(sportCar.getNumOfDoors());
        setPrice(sportCar.getPrice());
        setNumOfSeats(sportCar.getNumOfSeats());
        gasconsuption = sportCar.getGasconsuption();
        serialNum = serialNumcnt;
        serialNumcnt++;
    }

    public double getGasconsuption() {
        return gasconsuption;
    }

    public void setGasconsuption(double gasconsuption) {
        this.gasconsuption = gasconsuption;
    }


    @Override
    public String toString() {
        return  "Car has" + getNumOfSeats()
                + " seats and the price for Car is " + getPrice()
                + "Also this Car has " + getNumOfDoors() + " Doors"
                +" the gas consuption is " + gasconsuption;
    }
    public long getSerialNum() {
        return serialNum;
    }

    //Sportcar sp = new SportCar(this)
    public SportCar clone() {
        return new SportCar(this);
    }
    public double getPrice(){
        System.out.println("Price in SportCar");
        return price;
    }

}
