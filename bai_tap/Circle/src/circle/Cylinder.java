package circle;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getVolume(){
        return this.height*getErea();
    }

    @Override
    public String toString() {
        return  super.toString()
                + " height=" + height
                + " thể tích: " + getVolume();
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5,"red",6);
        System.out.println(cylinder);
    }
}