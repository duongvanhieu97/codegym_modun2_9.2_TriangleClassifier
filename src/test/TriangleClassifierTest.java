package test;

import model.TriangleClassifier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TriangleClassifierTest {
    @Test
    @DisplayName("case tam giác đều")
    void testEquilateralTriangle() {
        int triangleEdgeA = 2;
        int triangleEdgeB = 2;
        int triangleEdgeC = 2;
        String expected = "tam giác đều";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case tam vuông cân")
    void testIsoscelesTriangle() {
        int triangleEdgeA = 2;
        int triangleEdgeB = 2;
        int triangleEdgeC = 3;
        String expected = "tam giác cân";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Không phải tam giác")
    void testNoTriangle1() {
        int triangleEdgeA = 8;
        int triangleEdgeB = 2;
        int triangleEdgeC = 3;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Tam giác thường")
    void testTriangle() {
        int triangleEdgeA = 3;
        int triangleEdgeB = 4;
        int triangleEdgeC = 5;
        String expected = "Tam giác vuông";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Không phải tam giác")
    void testNoTriangle2() {
        int triangleEdgeA = -1;
        int triangleEdgeB = 2;
        int triangleEdgeC = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Không phải tam giác")
    void testNoTriangle3() {
        int triangleEdgeA = 0;
        int triangleEdgeB = 1;
        int triangleEdgeC = 1;
        String expected = "Không phải tam giác";
        String result = TriangleClassifier.getTriangle(triangleEdgeA, triangleEdgeB, triangleEdgeC);
        assertEquals(expected, result);
    }
}
