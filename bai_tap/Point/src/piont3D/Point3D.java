package piont3D;

import piont2D.Point2D;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(float[] array){
        array[0]=super.getX();
        array[1]=super.getY();
        array[2]=this.z;
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX()+ " x=" + super.getY()+" z=" + z+
                '}';
    }
}
class Testpoint3D{
    public static void main(String[] args) {
        Point3D point3D =new Point3D(5,6,9);
        System.out.println(point3D);
    }
}