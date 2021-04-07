public class MovablePoint extends Point2D {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;
    public MovablePoint() {
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arrSpeed = new float[2];
        arrSpeed[0] = this.xSpeed;
        arrSpeed[1] = this.ySpeed;
        return arrSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", speed=" + " ( " + getSpeed()[0] + "," + getSpeed()[1] + " )";
    }
    public MovablePoint move() {
        setX(getX() + this.xSpeed);
        setY(getY() + this.ySpeed);
        return MovablePoint.this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0,0,1,1);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
