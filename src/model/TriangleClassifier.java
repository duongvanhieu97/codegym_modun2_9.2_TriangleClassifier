package model;

public class TriangleClassifier {
    private int triangleEdgeA;
    private int triangleEdgeB;
    private int triangleEdgeC;

    public TriangleClassifier() {
    }

    public TriangleClassifier(int triangleEdgeA, int triangleEdgeB, int triangleEdgeC) {
        this.triangleEdgeA = triangleEdgeA;
        this.triangleEdgeB = triangleEdgeB;
        this.triangleEdgeC = triangleEdgeC;
    }

    public static String getTriangle(int triangleEdgeA, int triangleEdgeB, int triangleEdgeC) {
        if ((triangleEdgeA + triangleEdgeB > triangleEdgeC) && (triangleEdgeA + triangleEdgeC > triangleEdgeB) && (triangleEdgeB + triangleEdgeC > triangleEdgeA)) {
            if ((triangleEdgeA * triangleEdgeA == triangleEdgeB * triangleEdgeB + triangleEdgeC * triangleEdgeC) || (triangleEdgeB * triangleEdgeB == triangleEdgeA * triangleEdgeA + triangleEdgeC * triangleEdgeC) || (triangleEdgeC * triangleEdgeC == triangleEdgeA * triangleEdgeA + triangleEdgeB * triangleEdgeB)) {
                return "Tam giác vuông";
            } else if (triangleEdgeA == triangleEdgeB && triangleEdgeB == triangleEdgeC) {
                return "tam giác đều";
            } else if (triangleEdgeA == triangleEdgeB || triangleEdgeB == triangleEdgeC || triangleEdgeA == triangleEdgeC) {
                return "tam giác cân";
            } else if ((triangleEdgeA * triangleEdgeA > triangleEdgeB * triangleEdgeB + triangleEdgeC * triangleEdgeC) || (triangleEdgeB * triangleEdgeB > triangleEdgeC * triangleEdgeC + triangleEdgeA * triangleEdgeA) || (triangleEdgeC * triangleEdgeC > triangleEdgeB * triangleEdgeB + triangleEdgeA * triangleEdgeA)) {
                return "tam giác thường";
            } else return "tam giác thường";
        } else {
            return "Không phải tam giác";
        }
    }

}