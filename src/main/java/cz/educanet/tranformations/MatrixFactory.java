package cz.educanet.tranformations;

public class MatrixFactory {

    int width = 2;
    int height = 2;
    double scallarMultiplier = 3;

    public static IMatrix create(double[][] data) {
        return new Matrix();
    }


    double[][] testMatrix1 = new double[width][height];
    double[][] testMatrix2 = new double[width][height];

    public void initMatrix() {
        int p = 1;
        for (int i = 0; i <= width; i++) {
            for (int j = 0; j <= height; j++) {
                testMatrix1[i][j] = p;
                testMatrix2[i][j] = p;
                p++;
            }
        }
    }

    IMatrix matice2 = MatrixFactory.create(testMatrix1);
    IMatrix matice3 = MatrixFactory.create(testMatrix2);

}
