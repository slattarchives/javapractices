package parc20;

import java.util.Arrays;

interface MatrixElementOperations<T> {
    T add(T a, T b);
    T subtract(T a, T b);
    T multiply(T a, T b);
}

public class Matrix<T> {
    private T[][] data;
    private int rows;
    private int columns;
    private MatrixElementOperations<T> elementOperations;

    public Matrix(int rows, int columns, MatrixElementOperations<T> elementOperations) {
        this.rows = rows;
        this.columns = columns;
        this.elementOperations = elementOperations;
        data = (T[][]) new Object[rows][columns];
    }

    public void set(int row, int col, T value) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            throw new IllegalArgumentException("Неверные индексы");
        }
        data[row][col] = value;
    }

    public T get(int row, int col) {
        if (row < 0 || row >= rows || col < 0 || col >= columns) {
            throw new IllegalArgumentException("Неверные индексы");
        }
        return data[row][col];
    }

    public Matrix<T> add(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Размеры матриц не совпадают");
        }

        Matrix<T> result = new Matrix<>(rows, columns, elementOperations);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.set(i, j, elementOperations.add(data[i][j], other.get(i, j)));
            }
        }
        return result;
    }

    public Matrix<T> subtract(Matrix<T> other) {
        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException("Размеры матриц не совпадают");
        }

        Matrix<T> result = new Matrix<>(rows, columns, elementOperations);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.set(i, j, elementOperations.subtract(data[i][j], other.get(i, j)));
            }
        }
        return result;
    }

    public Matrix<T> multiplyByScalar(T scalar) {
        Matrix<T> result = new Matrix<>(rows, columns, elementOperations);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.set(i, j, elementOperations.multiply(data[i][j], scalar));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append(Arrays.toString(data[i]));
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MatrixElementOperations<Integer> intOperations = new MatrixElementOperations<Integer>() {
            @Override
            public Integer add(Integer a, Integer b) {
                return a + b;
            }

            @Override
            public Integer subtract(Integer a, Integer b) {
                return a - b;
            }

            @Override
            public Integer multiply(Integer a, Integer b) {
                return a * b;
            }
        };

        Matrix<Integer> matrix1 = new Matrix<>(2, 2, intOperations);
        matrix1.set(0, 0, 1);
        matrix1.set(0, 1, 2);
        matrix1.set(1, 0, 3);
        matrix1.set(1, 1, 4);

        Matrix<Integer> matrix2 = new Matrix<>(2, 2, intOperations);
        matrix2.set(0, 0, 5);
        matrix2.set(0, 1, 6);
        matrix2.set(1, 0, 7);
        matrix2.set(1, 1, 8);

        System.out.println("Matrix 1:");
        System.out.println(matrix1);

        System.out.println("Matrix 2:");
        System.out.println(matrix2);

        System.out.println("Matrix 1 + Matrix 2:");
        System.out.println(matrix1.add(matrix2));

        System.out.println("Matrix 1 - Matrix 2:");
        System.out.println(matrix1.subtract(matrix2));

        System.out.println("Matrix 1 * 2:");
        System.out.println(matrix1.multiplyByScalar(2));
    }
}