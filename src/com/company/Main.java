package com.company;

public class Main {

    public static void main(String[] args) {
        Rect rect1 = new Rect (7,9);
        Circle circle1 = new Circle(9);
        Tri tri1 = new Tri(5,8, 7);
        Tri tri2 = new Tri(3,8, 4);
        Rect rect2 = new Rect (9, 6);
        rect1.squareCalc();
        tri1.squareCalc();
        circle1.squareCalc();

        float sum = 0;

        Calculation [] ArrayFigures = {rect1,rect2,tri1,tri2,circle1};
        for (Calculation f : ArrayFigures) {
            sum += f.perimeterCalc();
        }
        System.out.println(sum);



    }
}
