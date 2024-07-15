package com.solid;

public class Main {
    public static void main(String[] args) {
        ImageManager manager = new ImageManager();
        manager.show();
        manager.setRenderer(new LaptopRenderer());
        manager.show();
        manager.setRenderer(new SmartphoneRenderer());
        manager.show();
        manager.setRenderer(new TVRenderer());
        manager.show();
    }
}