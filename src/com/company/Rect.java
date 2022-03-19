package com.company;

public class Rect implements Calculation {
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
    public void perimeterCalc() {
        float rectPer = (float) ((aR + bR) * 2);

    }
}
