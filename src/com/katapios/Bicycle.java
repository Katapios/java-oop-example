package com.katapios;

public class Bicycle extends Transport implements TransportInterface{

    public Bicycle(String color, int weight) {
        super(color, weight);
        Transport.needNoFuel = true;
    }

    public void ready(){
        super.setModel("Bicycle");
        super.ready();
    }

    @Override
    public void makeMove() {
        super.innerClass.testInnerClassMethod();
        System.out.println("I am a bicycle, and i move on two wheels");
    }

}
