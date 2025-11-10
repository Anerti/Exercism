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

        final double longest = Math.max(this.side1, Math.max(this.side2, this.side3));
        final double shortSum = this.side1 + this.side2 + this.side3 - longest;
        if (shortSum <= longest) throw new TriangleException();

        equalityIndex = new HashSet<>(List.of(this.side1, this.side2, this.side3)).size();
    }
    boolean isEquilateral() { return equalityIndex == 1; }
    boolean isIsosceles() { return equalityIndex <= 2 ; }
    boolean isScalene() { return !isIsosceles(); }
}