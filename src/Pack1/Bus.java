package Pack1;

public class Bus extends Vehicle {
    private int passangerCapacity;
    private long serialNum;
    private static long serialNumcnt = 2000;

    public Bus() {
        System.out.println("Creating Bus from default cons");
        passangerCapacity = 10;
    }

    public Bus(int passangerCapacity) {
        System.out.println("Creating Bus from parameter cons");
        this.passangerCapacity = passangerCapacity;
    }

    public Bus(Bus bus) {
        System.out.println("Creating Bus from copy cons");
        this.passangerCapacity = bus.passangerCapacity;
    }

    public Bus(int numberOfDoors,double price,int passangerCapacity){
        super(numberOfDoors,price);
        System.out.println("Creating Bus from super  cons");
        this.passangerCapacity = passangerCapacity;
    }
    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }
    public void setPrice(double price){
        if(price < 10000){
            System.out.println("The value is not valid");
            return;
        }else {
           super.setPrice(price);
        }
    }

    @Override
    public String toString() {
        return "Bus has" +
                "passangerCapacity=" + passangerCapacity +
                "and the price for bus is" + super.getPrice()+
                "Also thsi bus has " + getNumOfDoors() + " Doors";
    }

    @Override
    public long getSerialNum() {
        return serialNum;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}

