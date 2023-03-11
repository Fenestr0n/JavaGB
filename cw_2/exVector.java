package cw_2;

public class exVector {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1, 1);
        Vector vector2 = new Vector(1, 2, 1);
        
        System.out.println(vector1.toString());
        System.out.println("Length = " + vector1.length());
        System.out.println("Scal = " + vector1.scal(vector2));
        System.out.println("PrVect = " + vector1.vecPr(vector2));
        System.out.println("Cosinus = " + vector1.cosinus(vector2));
        System.out.println("SumVec = " + vector1.sumVec(vector2));
        System.out.println("DiffVec = " + vector1.diffVec(vector2));
    }
}
