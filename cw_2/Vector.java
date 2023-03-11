package cw_2;


public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector() {
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public String toString() {
        return "Vector [x=" + x + ", y=" + y + ", z=" + z + "]";
    }

    /**
     * 
     * @return длину вектора
     */
    public double length() {
         return Math.sqrt(x*x + y*y + z*z);
    }

    /**
     * 
     * @param vector
     * @return скалярное произведение
     */
    public double scal(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * 
     * @param vector
     * @return векторное произведение с другим вектором
     */
    public Vector vecPr(Vector vector) {
        return new Vector(y*vector.z - z*vector.y, z*vector.x - x*vector.z, x*vector.y - y*vector.x);
    }

    /**
     * 
     * @param vector
     * @return угол между векторами
     */
    public double cosinus(Vector vector) {
        return scal(vector) / (vector.length() * length());
    }

    /**
     * 
     * @param vector
     * @return сумма вектроров
     */
     public Vector sumVec(Vector vector) {
        return new  Vector(x + vector.x,
                        y + vector.y,
                        z + vector.z);
     }

    /**
     * 
     * @param vector
     * @return разность вектроров
     */
    public Vector diffVec(Vector vector) {
        return new  Vector(x - vector.x,
                        y - vector.y,
                        z - vector.z);
     }
}   



