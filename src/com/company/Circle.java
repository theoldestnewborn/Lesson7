package com.company;

public class Circle extends Figures implements Calculation {
    int rC;

    public Circle (int rC) {
        this.rC=rC;
    }

    @Override
    public void squareCalc() {
        float circleSquare = (float) (rC*rC*3.14);
        System.out.println(circleSquare);
    }

    @Override
    public float perimeterCalc () {
       float circlePer = (float) (2*rC*3.14);
       return circlePer;
    }
}
