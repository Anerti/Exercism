import java.util.HashSet;
import java.util.List;

class Triangle {
    private final double side1;
    private final double side2;
    private final double side3;
    private final int equalityIndex;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

        if ((side1 + side2 < side3) || (side2 + side3 < side1) || (side3 + side1 < side2))
            throw new TriangleException();
        if (side1 == 0 || side2 == 0 || side3 == 0)
            throw new TriangleException();
        
        equalityIndex = new HashSet<>(List.of(side1, side2, side3)).size();
    }

    boolean isEquilateral() { return equalityIndex == 1; }

    boolean isIsosceles() { return equalityIndex == 2 || isEquilateral(); }

    boolean isScalene() { return equalityIndex == 3; }

}