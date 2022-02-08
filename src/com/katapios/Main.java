package com.katapios;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport("Green", 200);
        transport.ready();

        Car car = new Car("Mazda 3");
        car.makeMove();
        car.ready();

        Car x5 = new Car("Blue", 2000, "Bmw X5");
        x5.makeMove();
        x5.ready();

        Bicycle bicycle = new Bicycle("White", 20);
        bicycle.makeMove();
        bicycle.ready();

        KickScooter kickScooter = new KickScooter();
        kickScooter.makeMove();
        kickScooter.rideOnTrip();

        //Anonymous class
        (new AbstractTransport() {

            @Override
            void rideOnTrip() {
                System.out.println("\nI'm riding on nature by anonymous class making from abstract class");
            }

        }).rideOnTrip();

    }

}
