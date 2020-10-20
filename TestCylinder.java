package lab06.exam2;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.printf("\nRadius is " + cy1.getRadius()+"\nHeight is "+ cy1.getHeight()
        +"\nColor is "+ cy1.getColor()+"\nBase area is "+cy1.getArea()
        +"\nVolume is "+cy1.getVolume());
        Cylinder cy2 = new Cylinder(5.0,2.0);
        System.out.printf("\nRadius is " +cy2.getRadius()+"\nHeight is "+ cy2.getHeight()
        +"\nColor is "+ cy2.getColor()+"\nBase area is "+cy2.getArea()+"\nVolume is "+cy2.getVolume());
    }
}
