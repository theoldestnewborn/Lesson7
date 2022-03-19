package com.company;

public class Rect implements Calculation{
    int aR, bR;

    public Rect(int aR, int bR) {
        this.aR = aR;
        this.bR = bR;
    }


    @Override
    public void squareCalc() {
        int rectSquare = aR * bR;
        System.out.println(rectSquare);
    }

    @Override
    public float perimeterCalc() {
        float rectPer = (aR + bR) * 2;
        return rectPer;
    }
}
