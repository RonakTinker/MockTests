package in.ineuron.Problems;

interface Drawable {
    void draw();
}

class CCircle implements Drawable {
   

    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class RRectangle implements Drawable {
  
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class Problem4 {
    public static void main(String[] args) {
        CCircle circle = new CCircle();
        circle.draw();

        RRectangle rectangle = new RRectangle();
        rectangle.draw();
    }
}

