package com.solid;

public class SaveCSVFile implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Saving the Circle.");
    }

    @Override
    public void visitTriangle(Triangle triangle) {
        System.out.println("Saving the Triangle.");
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Saving the Rectangle.");
    }

}
