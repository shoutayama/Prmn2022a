package lecture02;

import java.awt.*;

public class Car {
    int fuel;

    Tire[] tires;
    Engine engine;
    Car(){
        fuel=0;
    }
    Car(Tire[] tires,Engine engine){
        fuel=0;
        this.tires=tires;
        this.engine=engine;
    }

    public void run() {
        if (fuel<=0){
            System.out.println("走れません");
        }
        else {
            fuel--;
            System.out.println("燃料を1消費して走りました。"+fuel);
        }
    }
    public void startEngine(){
        this.engine.start();
    }

}
