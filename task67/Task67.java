package task67;


//
//By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.
//
//        3
//        7 4
//        2 4 6
//        8 5 9 3
//
//        That is, 3 + 7 + 4 + 9 = 23.
//
//        Find the maximum total from top to bottom in triangle.txt (right click and 'Save Link/Target As...'), a 15K text file containing a triangle with one-hundred rows.
//
//        NOTE: This is a much more difficult version of Problem 18. It is not possible to try every route to solve this problem, as there are 299 altogether! If you could check one trillion (1012) routes every second it would take over twenty billion years to check them all. There is an efficient algorithm to solve it. ;o)



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Pitrecki on 2016-10-14.
 */
public class Task67
{
    private long[][] triangle;
    private static final String FILE_DESTINATION = "P:\\#Java nauka\\PROJECT EULER\\src\\task67\\triangle.txt";

    public static void main(String[] args) {
        Task67 task67 = new Task67();
        long startTime = System.currentTimeMillis();
        MaxPathSumSolver solver = new MaxPathSumSolver(FILE_DESTINATION, 2);
        task67.fileOpenAndSave(FILE_DESTINATION);
        task67.resolve();
        solver.solve();
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime)/1e3);

    }

    public void triangleListInit(int lines) {
        triangle = new long[lines][];
        for (int i = 0; i < lines; i++) {
            triangle[i] = new long[i + 1];
        }
    }

    public void fileOpenAndSave(String fileDestination) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileDestination));
            StringBuffer buffer = new StringBuffer();
            String str;

            int currentLine = 0;
            while ((str = in.readLine()) != null) {
                buffer.append(str);
                currentLine++;
            }

            str = buffer.toString().replaceAll(" ", "");
            int strIndex = 0;

            triangleListInit(currentLine);

            for (int i = 0; i < triangle.length; i++) {
                for (int j = 0; j < triangle[i].length; j++) {
                    triangle[i][j] = Integer.parseInt(str.substring(strIndex, strIndex + 2));
                    strIndex+=2;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void resolve() {
        int lines = triangle[triangle.length - 1].length;
        for (int i = lines - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++)
                triangle[i][j] += Math.max(triangle[i+1][j], triangle[i +1][j+ 1 ]);
        }

        System.out.println("Result is:" + Arrays.toString(triangle[0]));
    }
}
