package com.company;

//? Create an abstract class shape. Let rectangle and triangle inherit this shape class. Add necessary functions.

abstract class Shape {
    abstract void draw(); //! Abstract draw method

    abstract float area(float a, float b); //! Abstract perimeter method
}

//! Triangle Class extends from Shape Class
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle is drawn");
    }

    @Override
    float area(float a, float b) {
        return ((a * b) / 2);
    }
}


//! Rectangle Class extends from Shape Class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Rectangle is drawn");
    }

    @Override
    float area(float a, float b) {
        return ((a * b));
    }
}

public class AbstractClass { //! Class containing main method
    public static void main(String[] args) {
        Triangle tri = new Triangle();
        Rectangle rec = new Rectangle();

        //! Call the Draw method by object
        tri.draw();
        rec.draw();


        //! Call the Perimeter method by object using parameters
        float firstPara = 3; //! Parameter First
        float secondPara = 3; //! Parameter Second

        float areaOfTriangle = tri.area(firstPara, secondPara);
        float areaOfRectangle = rec.area(firstPara, secondPara);

        System.out.println("Area of Rectangle is = " + areaOfRectangle);
        System.out.println("Area of Triangle is = " + areaOfTriangle);
    }
}