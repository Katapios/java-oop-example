package com.katapios;

public class Transport {
    private String color;
    private int weight;
    private String model;
    private String fuel = ", and needs fuel";

    public static boolean needNoFuel = false;


    public Transport() {
    }

    public Transport(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void ready(){


        System.out.println(
                "The " + color +
                (model != null ? " " + model + ", weight " : " transport, weight ") +
                weight + " kg" +
                (needNoFuel ? ", need NO fuel" : ", need fuel") +"\n"
        );

    }
    //inner Class
    class InnerClass{
        public void testInnerClassMethod(){
            System.out.println("> > > Hi from inner class");
        }
    }

    InnerClass innerClass = new InnerClass();

}
