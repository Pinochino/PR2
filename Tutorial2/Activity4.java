package Tutorial2;

public class Activity4 {
    public static int[][] transpose(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            if (M[i] == null) {
                System.out.println("The array is empty");
            }
        }
    
        int[][] T = new int[M[0].length][M.length];
    
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                T[j][i] = M[i][j]; 
            }
        }
        return T;
    }
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int[][] result = transpose(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
