package views;

import model.TriangleClassifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh A");
        int triangleEdgeA = scanner.nextInt();
        System.out.println("nhap canh B");
        int triangleEdgeB = scanner.nextInt();
        System.out.println("nhap canh C");
        int triangleEdgeC = scanner.nextInt();
//        TriangleClassifier triangleClassifier = new TriangleClassifier(triangleEdgeA,triangleEdgeB,triangleEdgeC);
        System.out.println(TriangleClassifier.getTriangle(triangleEdgeA,triangleEdgeB,triangleEdgeC));
    }
}
