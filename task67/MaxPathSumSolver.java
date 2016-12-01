package task67;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-10-14.
 */
public class MaxPathSumSolver
{
    private long[][] matrix;
    private String fileDestination;
    private int lengthNumber;

    public MaxPathSumSolver(String fileDestination, int lengthNumberth) {
        this.fileDestination = fileDestination;
        this.lengthNumber = lengthNumberth;
        readFile(fileDestination);
    }

    private void readFile(String fileDestination) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileDestination));
            StringBuffer buffer = new StringBuffer();
            String currentReadLine;


            int currentLineNumber = 0;
            while ((currentReadLine = bufferedReader.readLine()) != null) {
                buffer.append(currentReadLine);
                currentLineNumber++;
            }

            matrixInitilization(currentLineNumber);

            String str = buffer.toString().replaceAll(" ", "");
            int strIndex = 0;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Long.parseLong(str.substring(strIndex, strIndex + lengthNumber));
                    strIndex += lengthNumber;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Creating triangle matrix
     *
     * @param lines
     */

    private void matrixInitilization(int lines) {
        this.matrix = new long[lines][];
        for (int i = 0; i < lines; i++)
            matrix[i] = new long[i + 1];
    }

    public void solve() {
        //Last row of matrix
        int line = this.matrix[matrix.length - 1].length;
        for (int i = line - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                matrix[i][j] += Math.max(matrix[i + 1][j], matrix[i + 1][j + 1]);
        }

        System.out.println("Result is:" + Arrays.toString(matrix[0]));
    }


}
