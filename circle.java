public class ntn4 {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("The circle has radius of "
                + c1.getRadius() + " and area of " + c1.getArea());


        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + c2.getRadius() + " and area of " + c2.getArea());


        Circle c3 = new Circle(3.0, "blue");
        System.out.println("The circle has radius of "
                + c3.getRadius() + ", color " + c3.getColor()
                + " and area of " + c3.getArea());
    }
}


class Circle {
    private double radius;
    private String color;


    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }


    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }


    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

   
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}