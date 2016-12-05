package Task22;

import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value
 * by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in
 * the list. So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 * <p>
 * Created by Pitrecki on 2016-12-02.
 */
public class Task22
{

    private static final String PATH = "P:/#Java nauka/PROJECT EULER/src/names.txt";

    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();
        String readiedData = readFile(PATH);

        List<String> namesList = Arrays.asList(readiedData.replaceFirst("\"", "").split("\",\""));
        namesList.sort(null);
        /*
        Or you can use this
        Collections.sort(namesList);
         */

        char[] asciiTable = asciiTableGenerator();
        long totalSum = solve(namesList, asciiTable);

        long endTime = System.currentTimeMillis();
        System.out.println("Total sum: " + totalSum + "\nTime: " + (endTime - starTime) / 1e3 + " s");
    }

    private static String readFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            //check if file is not empty
            if (bufferedReader.ready()) {
                String strLine = bufferedReader.readLine();
                return strLine;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static char[] asciiTableGenerator() {
        char[] asciiTable = new char[26];
        for (int i = 0; i < asciiTable.length; i++)
            asciiTable[i] = (char) ('a' + i);

        return asciiTable;

    }

    private static long solve(List<String> list, char[] asciiTable) {
        long fullResult = 0;
        int listIndex = 0;
        for (String singleName : list) {
            long localSum = 0;
            char[] strCharArray = singleName.toLowerCase().toCharArray();
            for (char letter : strCharArray) {
                for (int k = 0; k < asciiTable.length; k++)
                    if (letter == asciiTable[k])
                        localSum += (k + 1);

            }
            fullResult += (localSum * (listIndex + 1));
            listIndex++;
        }

        return fullResult;
    }
}


