package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Car car =new Car();
        GasStation station=new GasStation();
        car.run();
        station.refuel(car);
        car.run();
    }
}
