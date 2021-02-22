package circle;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_BLUEPeer;

public class Circle {
    private double radius;
    private String color;
    private double erea;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getErea() {
        return erea;
    }

    public void setErea(double erea) {
        this.erea = erea;
    }

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        this.erea = Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color=" + color +
                ", erea=" + erea +
                '}';
    }
}
class TestCircle{
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Blue");
        System.out.println(circle);
    }
}