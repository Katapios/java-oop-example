package com.katapios;

abstract class AbstractTransport {
    private String color;
    private int weight;
    private String model;
    private String fuel = ", and needs fuel";

    public static boolean needNoFuel = false;


    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void ready() {


        System.out.println(
                "The " + color +
                        (model != null ? " " + model + ", weight " : " transport, weight ") +
                        weight + " kg" +
                        (needNoFuel ? ", need NO fuel" : ", need fuel")
        );

    }

    abstract void rideOnTrip();


}
