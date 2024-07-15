package com.solid;

public class ImageManager {
     
    private Renderer renderer;
    
    public void setRenderer(Renderer renderer) {
        this.renderer = renderer;
    }
    
    public void show() {
        if (renderer != null) {
            renderer.showImage();
        } else {
            System.out.println("Renderer not defined.");
        }
    }
}
