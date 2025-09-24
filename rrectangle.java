public class ntn4 {
    public static void main(String[] args) {


               Rectangle r1 = new Rectangle();
                System.out.println(r1); // Rectangle[length=1.0, width=1.0]
                System.out.println("Area = " + r1.getArea());
                System.out.println("Perimeter = " + r1.getPerimeter());

                Rectangle r2 = new Rectangle(3.5, 2.0);
                System.out.println(r2);
                System.out.println("Area = " + r2.getArea());
                System.out.println("Perimeter = " + r2.getPerimeter());
            }
        }


        class Rectangle {
            private double length;
            private double width;

           
            public Rectangle() {
                this.length = 1.0;
                this.width = 1.0;
            }

            
            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }

            public double getLength() {
                return length;
            }

            public void setLength(double length) {
                this.length = length;
            }

            public double getWidth() {
                return width;
            }

            public void setWidth(double width) {
                this.width = width;
            }

            public double getArea() {
                return length * width;
            }

            public double getPerimeter() {
                return 2 * (length + width);
            }

            @Override
            public String toString() {
                return "Rectangle[length=" + length + ", width=" + width + "]"; 


               
            }
        }
