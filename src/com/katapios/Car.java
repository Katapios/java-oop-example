package com.katapios;

public class Car extends Transport implements TransportInterface{
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
        super.setModel(this.carModel);
        super.setColor("noColor");
        super.setWeight(1000);
    }

    public Car(String color, int weight, String model) {
        super(color, weight);
        super.setModel(model);
    }

    public void ready(){
        super.ready();
    }

    @Override
    public void makeMove() {
        System.out.println("I am a car, and i move on four wheels");
    }

}
