package com.solid;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        shapes.add(new Triangle());

        Visitor save = new SaveCSVFile();

        for(Shape shape : shapes)
            shape.accept(save);
    }
}