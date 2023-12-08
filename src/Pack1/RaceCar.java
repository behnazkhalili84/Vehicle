package Pack1;

public class RaceCar extends SportCar {
    private int hoursepower;
    private long serialNum;
    private static long serialNumcnt = 5000;
    public RaceCar(){
        System.out.println("Creating raceCar from default cons");
        hoursepower = 400;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }

    public RaceCar(int numOfDoors, double price, int numOfSeats, double gasconsuption, int hoursepower) {
        super(numOfDoors, price, numOfSeats, gasconsuption);
        System.out.println("Creating raceCar from super cons");
        this.hoursepower = hoursepower;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }
    public RaceCar(RaceCar raceCar){
        System.out.println("Creating race Car from copy cons");
        setNumOfDoors(raceCar.getNumOfDoors());
        setPrice(raceCar.getPrice());
        setNumOfSeats(raceCar.getNumOfSeats());
        setGasconsuption(raceCar.getGasconsuption());
        hoursepower = raceCar.hoursepower;
        serialNum = serialNumcnt;
        serialNumcnt++;
    }

    public int getHoursepower() {
        return hoursepower;
    }

    public void setHoursepower(int hoursepower) {
        this.hoursepower = hoursepower;
    }

    @Override
    public String toString() {
        return "Car has" + getNumOfSeats()
                + " seats and the price for Car is " + getPrice()
                + " Also this Car has " + getNumOfDoors() + " Doors"
                +"  the gas consuption is " + getGasconsuption()
                + " the hourse power is   :  " + hoursepower;
    }
    public long getSerialNum() {
        return serialNum;
    }

    public RaceCar clone() {
        return new RaceCar(this);
    }
}
