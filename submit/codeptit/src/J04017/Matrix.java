package J04017;
import java.util.*;
public class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix other) {
        Matrix res = new Matrix(n, other.m);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < other.m; j++) {
                for (int k = 0; k < this.m; k++) {
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        return res;
    }

    public Matrix trans() {
        Matrix res = new Matrix(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res.a[i][j] = this.a[j][i];
            }
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.append(a[i][j]).append(" ");
            }
            res.append("\n");
        }
        return res.toString().trim();
    }
}
