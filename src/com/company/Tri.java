package com.company;

public class Tri implements Calculation {
    int aT, bT, cT;

    public Tri(int aT, int bT, int cT) {
        this.aT = aT;
        this.bT = bT;
        this.cT = cT;
    }

    @Override
    public void squareCalc () {
        int triSquare = aT*bT/2;
        System.out.println(triSquare);
    }

    @Override
    public void perimeterCalc () {
        float triPer = (float) (aT + bT + cT);
    }
}