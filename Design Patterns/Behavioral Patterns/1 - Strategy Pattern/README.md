# Strategy Pattern

## Exercise

In the previous lecture we have discussed how to implement the strategy pattern. In this exercise your task is to apply this pattern - and to refactor some classes and methods.

The problem is that we want to show (render) images but there may be several devices: laptops, smartphones and smart TVs. We have to apply different approaches so we have 3 different classes - one for every device.

```java
    public class TVRenderer {
     
    	public void showImage() {
    		System.out.println("Showing an image on TV...");
    	}
    }

    public class SmartphoneRenderer {
     
    	public void showImage() {
    		System.out.println("Showing an image on smartphone...");
    	}
    }

    public class LaptopRenderer {
    	
    	public void showImage() {
    		System.out.println("Showing an image on laptop...");
    	}
    }
```

We have another class - the ImageManager - that will decide what class to use. In this implementation we use Objects with if-else statements:

```java
    public class ImageManager {
     
    	private Object renderer;
    	
    	public void setRenderer(Object renderer) {
    		this.renderer = renderer;
    	}
    	
    	public void show() {
    		if(renderer instanceof TVRenderer) {
    			TVRenderer tvRenderer = (TVRenderer) renderer;
    			tvRenderer.showImage();
    		} else if(renderer instanceof LaptopRenderer) {
    			LaptopRenderer tvRenderer = (LaptopRenderer) renderer;
    			tvRenderer.showImage();
    		} else if(renderer instanceof SmartphoneRenderer) {
    			SmartphoneRenderer tvRenderer = (SmartphoneRenderer) renderer;
    			tvRenderer.showImage();
    		}
    		
    	}
    }
```

Of course it is not a good approach becasue it violates the SOLID principles - and it is extremely hard to test if-else statements because of the cyclomatic complexity.

Let's use the strategy pattern and refactor the code!

Good luck!
