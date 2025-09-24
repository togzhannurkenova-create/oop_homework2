public class ntn4 {
    public static void main(String[] args) {
        
                Ball ball = new Ball(1.1f, 2.2f, 10, 5, 30);
                System.out.println(ball);

                ball.setX(80.0f);
                ball.setY(35.0f);
                System.out.println(ball);

                ball.move();
                System.out.println(ball);

               
                System.out.println("Reflecting horizontally...");
                ball.reflectHorizontal();
                ball.move();
                System.out.println(ball);
            }
        }

        class Ball {
            private float x;
            private float y;
            private int radius;
            private float xDelta;
            private float yDelta;

            public Ball(float x, float y, int radius, int speed, int direction) {
                this.x = x;
                this.y = y;
                this.radius = radius;
                this.xDelta = (float) (speed * Math.cos(Math.toRadians(direction)));
                this.yDelta = (float) (speed * Math.sin(Math.toRadians(direction)));
            }

            public float getX() {
                return x;
            }

            public void setX(float x) {
                this.x = x;
            }

            public float getY() {
                return y;
            }

            public void setY(float y) {
                this.y = y;
            }

            public int getRadius() {
                return radius;
            }

            public void setRadius(int radius) {
                this.radius = radius;
            }

            public float getXDelta() {
                return xDelta;
            }

            public void setXDelta(float xDelta) {
                this.xDelta = xDelta;
            }

            public float getYDelta() {
                return yDelta;
            }

            public void setYDelta(float yDelta) {
                this.yDelta = yDelta;
            }

            public void move() {
                this.x += xDelta;
                this.y += yDelta;
            }

            public void reflectHorizontal() {
                xDelta = -xDelta;
            }

            public void reflectVertical() {
                yDelta = -yDelta;
            }

            @Override
            public String toString() {
                return "Ball[(" + x + ", " + y + "), speed=(" + xDelta + ", " + yDelta + ")]";
            }
        }


