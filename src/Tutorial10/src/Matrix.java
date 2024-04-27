package Tutorial10.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    private final int[][] data;

    public Matrix(int[][] data) {
        this.data = data;
    }

    public static Matrix read(String filename) throws FileNotFoundException {
        try (Scanner sc = new Scanner(new File(filename))) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] data = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    data[i][j] = sc.nextInt();
                }
            }
            return new Matrix(data);
        }
    }

    public void write(String filename) throws FileNotFoundException {
        try (PrintWriter writer = new PrintWriter(filename)) {
            int rows = data.length;
            int cols = data[0].length;
            writer.println(rows + " " + cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    writer.print(data[i][j] + " ");
                }
                writer.println();
            }
        }
    }

    public Matrix sum(Matrix other) {
        int rows = data.length;
        int cols = data[0].length;
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = data[i][j] + other.data[i][j];
            }
        }
        return new Matrix(sum);
    }

    public Matrix product(Matrix other) {
        int rowsOfFirst = data.length;
        int colsOfSecond = other.data[0].length;
        int colsOfFirst = data[0].length;
        int[][] product = new int[rowsOfFirst][colsOfSecond];
        for (int i = 0; i < rowsOfFirst; i++) {
            for (int j = 0; j < colsOfSecond; j++) {
                for (int k = 0; k < colsOfFirst; k++) {
                    product[i][j] += data[i][k] * other.data[k][j];
                }
            }
        }
        return new Matrix(product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int[] row : data) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        try {
            Matrix matrix1 = Matrix.read("D:/Workspace/JAVA/PR2/Tutorial 10/src/TXT/matrix1.txt");
            Matrix matrix2 = Matrix.read("D:/Workspace/JAVA/PR2/Tutorial 10/src/TXT/matrix2.txt");
            System.out.println("Tutorial10.Matrix 1:");
            System.out.println(matrix1);
            System.out.println("Tutorial10.Matrix 2:");
            System.out.println(matrix2);
            Matrix sum = matrix1.sum(matrix2);
            System.out.println("Sum:");
            System.out.println(sum);
            Matrix product = matrix1.product(matrix2);
            System.out.println("Tutorial3.Tutorial4.Product:");
            System.out.println(product);
            matrix1.write("output.txt");
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
