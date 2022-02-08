package com.katapios;

public class KickScooter extends AbstractTransport implements TransportInterface{

    //Abstract method
    @Override
    void rideOnTrip() {
        System.out.println("I'm riding on nature by kick scooter");
    }

    //Interface method
    @Override
    public void makeMove() {
        System.out.println("I am a kick scooter, and i move on two wheels");
    }

}
