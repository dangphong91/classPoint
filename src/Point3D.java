public class Point3D extends Point2D {
    private float z = 0.0f;
    public Point3D() {
    }
    public Point3D(float x, float y, float z) {
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        float[] arr = new float[3];
        arr[0] = getX();
        arr[1] = getY();
        arr[2] = this.z;
        return arr;
    }
    @Override
    public String toString() {
        return "( " + getXYZ()[0] + ","
                + getXYZ()[1] + ","
                + getXYZ()[2] + " )";
    }

    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,4,5);
        System.out.println(point3D.toString());
        point3D.setXYZ(5,6,7);
        System.out.println(point3D.toString());
    }
}
