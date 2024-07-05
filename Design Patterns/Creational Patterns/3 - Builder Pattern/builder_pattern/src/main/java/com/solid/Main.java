package com.solid;

public class Main {
    public static void main(String[] args) {
        Student elric = new Student.Builder("Elric", "Melniboné").setAge(200).build();
        System.out.println(elric);
    }
}