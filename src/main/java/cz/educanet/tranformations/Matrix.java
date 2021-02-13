package cz.educanet.tranformations;

import java.util.Arrays;

public class Matrix implements IMatrix {
    MatrixFactory mf = new MatrixFactory();

    private final double[][] rawArray = new double[getRows()][getColumns()];


    @Override
    public int getRows() {
        return rawArray.length;
    }

    @Override
    public int getColumns() {
        if (getRows() > 0)
            return rawArray[0].length;
            return 0;
    }

    @Override
    public IMatrix times(IMatrix matrix) {
        double[][] temp = new double[getRows()][getColumns()];
        for (int i = 0; i <= mf.width; i++) {
            for (int j = 0; j <= mf.height; j++) {
                temp[i][j] = mf.testMatrix1[j][i] * mf.testMatrix2[i][j];
            }
        }
        IMatrix matice = MatrixFactory.create(temp);
        return matice;
    }

    @Override
    public IMatrix times(Number scalar) {
        double[][] temp = new double[getRows()][getColumns()];
        for (int i = 0; i <= mf.width; i++) {
            for (int j = 0; j <= mf.height; j++) {
                temp[i][j] = mf.testMatrix1[i][j] * mf.scallarMultiplier;
            }
        }
        IMatrix matice = MatrixFactory.create(temp);
        return matice;
    }

    @Override
    public IMatrix add(IMatrix matrix) {
        double[][] temp = new double[getRows()][getColumns()];
        for (int i = 0; i <= mf.width; i++) {
            for (int j = 0; j <= mf.height; j++) {
                temp[i][j] = mf.testMatrix1[i][j] + mf.testMatrix2[i][j];
            }
        }
        IMatrix matice = MatrixFactory.create(temp);
        return matice;
    }

    @Override
    public double get(int n, int m) {
        return 0;
    } 


    
    //region Optional
    @Override
    public IMatrix transpose() {
        return null;
    }

    @Override
    public double determinant() {
        return 0;
    }
    //endregion
    //region Generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;

        for (int i = 0; i < rawArray.length; i++) {
            if(!Arrays.equals(rawArray[i], matrix.rawArray[i]))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(rawArray);
    }
    //endregion
}
